package opencgd.server;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineCoverage;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;
import org.jboss.netty.handler.codec.replay.VoidEnum;

public class Server {
	
	private final InetSocketAddress address;
	
	private Server(final InetSocketAddress address){
		this.address = address;
	}
	
	public static void main(String[] args) throws Exception {
		final Server server = new Server(new InetSocketAddress(4600));
		server.bind();
	}
	
	public void bind(){
		final ChannelFactory factory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
		final ServerBootstrap bootstrap = new ServerBootstrap(factory);
		final ChannelPipeline pipeline = bootstrap.getPipeline();
		configurePipeline(pipeline);
		bootstrap.setOption("child.tcpNoDelay", true);
		bootstrap.setOption("child.keepAlive", true);		
		bootstrap.bind(address);
	}
	
	private void configurePipeline(final ChannelPipeline pipeline){
		pipeline.addLast("encoder", new Encoder());
		pipeline.addLast("decoder", new Decoder());
		pipeline.addLast("handler", new ServiceHandler());
	}
	
	@ChannelPipelineCoverage("all")
	private static final class Encoder extends SimpleChannelHandler {
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void writeRequested(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
			if(!(e.getMessage() instanceof Frame)){
				ctx.sendDownstream(e);
				return;
			}
			
			final Frame frame = (Frame) e.getMessage();
			final ChannelBuffer buf = ChannelBuffers.dynamicBuffer();
			buf.writeShort((short) (frame.getSize()+1));
			buf.writeByte((byte) frame.getID());
			buf.writeBytes(frame.getData());
			Channels.write(ctx, e.getFuture(), buf, e.getRemoteAddress());
		}
	}
	
	private static final class Decoder extends ReplayingDecoder<VoidEnum> {
		/**
		 * {@inheritDoc}
		 */
		@Override
		protected Object decode(ChannelHandlerContext ctx, Channel channel, ChannelBuffer buffer, VoidEnum state) throws Exception {
			int length = buffer.readShort()-1;
			int id = buffer.readUnsignedByte();
			
			byte[] data = new byte[(int)length];
			buffer.readBytes(data);
			
			Frame frame = new Frame();
			frame.setID(id);
			frame.setData(data);
			return frame;
		}
	}
	
	@ChannelPipelineCoverage("all")
	private static final class ServiceHandler extends SimpleChannelHandler {
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e){
			System.out.println("Why hellooooo...");
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void messageReceived(ChannelHandlerContext ctx, MessageEvent e){
			final FrameReader frame = new FrameReader((Frame) e.getMessage());
			
			if(frame.getID() != 4){ //Stop the console spam
				System.out.println("Received packet ID="+frame.getID()+", Size="+frame.getSize());
			}
			
			/*
			 * YES,
			 * This is messy, but it's only for testing right now.
			 */
			
			if(frame.getID() == 0){
				final String compound = new String(frame.getData());
				final String username = compound.substring(0, 12).trim();
				final String password = compound.substring(12, compound.length()).trim();
				System.out.println("U="+username+", P="+password);
				
				FrameWriter response = new FrameWriter();
				response.setID(0); //0=accept, 1=criticizeNewbie, 2=serverFull, 3=idiotUser, 4 or higher = confused client
				
				ctx.getChannel().write(response.createFrame());
			} else if(frame.getID() == 3){
				final String msg = new String(frame.getData());
				System.out.println("Chat message: "+msg);
				
				if(msg.charAt(0) == '/'){
					final String command = msg.substring(1);
					
					if(command.equals("chreq")){
						final FrameWriter response = new FrameWriter(9);
						response.addShort(2); //Index of waitingList
						response.addShort(4); //Time per move l[o];
						response.addShort(1); //Nonrated(0)/Rated(1)
						ctx.getChannel().write(response.createFrame());
					}
				}
			} else if(frame.getID() == 16){
				int game = frame.readByte();
				
				if(game == 0){
					System.out.println("Game change: ENTER LOBBY");
					//close interface
				} else {
					//entering in a new game
					game--;
					System.out.println("Game change: "+game);
				}
			} else if(frame.getID() == 15){
				System.out.println("Showing interface");
				//opened interface
				
				FrameWriter response = new FrameWriter(5);
				response.addShort(4); //number of players
				response.addShort(3); //current player's ID
				
				for(int i = 0; i < 4; i++){
					response.addShort(i); //index
					response.addShort(0); //rating
					response.addShort(0); //score
					response.addBytes(encodeUsername("bob"+i));
				}
				
				ctx.getChannel().write(response.createFrame());
				
				//Send hiscores list
				FrameWriter hiscores = new FrameWriter(7);
				hiscores.addInt(400); //My score
				
				for(int i = 0; i < 50; i++){
					hiscores.addBytes(encodeUsername("test"+i));
					hiscores.addInt(i*20); //score of user
					hiscores.addShort(i*3); //# games played
					hiscores.addShort(i); //# games won
				}
				
				ctx.getChannel().write(hiscores.createFrame());
			} else if(frame.getID() == 5){
				System.out.println("Set match options");
				final int timeSetting = frame.readShort();
				final boolean isRated = frame.readShort() == 1;
				final int filter = frame.readShort();
				
				System.out.println("Time="+timeSetting+", Rated?="+isRated+", Filter="+filter);
			} else if(frame.getID() == 6){
				System.out.println("Challenging...");
				
				//Show the challenge request screen				
				FrameWriter response = new FrameWriter(10);
				response.addShort(2);
				response.addShort(4);
				response.addShort(1);
				ctx.getChannel().write(response.createFrame());
			}
		}
		
		//TODO Move out
		private byte[] encodeUsername(String name){
			//XXX string builder...
			while(name.length() < 12){
				name += ' ';
			}
			
			return name.getBytes();
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e){
			System.out.println("Lost client");
		}
	}
}