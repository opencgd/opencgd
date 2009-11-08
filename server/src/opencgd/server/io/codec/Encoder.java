package opencgd.server.io.codec;

import opencgd.server.io.Frame;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.buffer.ChannelBuffers;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelPipelineCoverage;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

@ChannelPipelineCoverage("all")
public final class Encoder extends SimpleChannelHandler {
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