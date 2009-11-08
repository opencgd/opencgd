package opencgd.server;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import opencgd.server.io.Frame;
import opencgd.server.io.FrameReader;
import opencgd.server.io.ISession;
import opencgd.server.io.codec.Decoder;
import opencgd.server.io.codec.Encoder;
import opencgd.server.util.DefaultLoginValidator;
import opencgd.server.util.ILoginValidator;
import opencgd.server.util.logging.NameDeterminer;
import opencgd.server.util.logging.SimpleLoggerFactory;

import org.grlea.log.SimpleLogger;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineCoverage;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.logging.InternalLoggerFactory;
import org.jboss.netty.util.ThreadRenamingRunnable;

public class Server {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(Server.class);
	private static final NameDeterminer NAME_DETERMINER = new NameDeterminer();
	private static ILoginValidator loginValidator = new DefaultLoginValidator();
	private final InetSocketAddress address;
	
	private Server(final InetSocketAddress address){
		this.address = address;
	}
	
	public static void main(String[] args) throws Exception {
		ThreadRenamingRunnable.setThreadNameDeterminer(NAME_DETERMINER);
		InternalLoggerFactory.setDefaultFactory(new SimpleLoggerFactory());
		
		LOGGER.info("OpenCGD starting on port 4600.");
		
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
	private static final class ServiceHandler extends SimpleChannelHandler {
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e){
			ctx.setAttachment(SessionManager.getInstance().create(ctx.getChannel()));
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void messageReceived(ChannelHandlerContext ctx, MessageEvent e){
			final Frame frame = (Frame) e.getMessage();
			((ISession) ctx.getAttachment()).onFrame(frame, new FrameReader(frame));
		}
		
		/**
		 * {@inheritDoc}
		 */
		@Override
		public void channelDisconnected(ChannelHandlerContext ctx, ChannelStateEvent e){
			SessionManager.getInstance().remove((ISession) ctx.getAttachment());
			((ISession) ctx.getAttachment()).onDisconnect();
		}
	}

	public static ILoginValidator getLoginValidator(){
		return loginValidator;
	}

	public static void setLoginValidator(ILoginValidator loginValidator){
		Server.loginValidator = loginValidator;
	}
}