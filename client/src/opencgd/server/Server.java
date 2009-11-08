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
			buf.writeShort((short) frame.getSize());
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
			final Frame frame = (Frame) e.getMessage();
			
			System.out.println("Received packet ID="+frame.getID()+", Size="+frame.getSize()+1);
			
			if(frame.getID() == 0){
				Frame response = new Frame();
				response.setID(0); //0=accept, 1=criticizeNewbie, 2=serverFull, 3=idiotUser, 4 or higher = confused client
				
				ctx.getChannel().write(response);
			}
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