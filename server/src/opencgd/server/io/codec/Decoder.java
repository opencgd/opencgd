package opencgd.server.io.codec;

import opencgd.server.io.Frame;

import org.jboss.netty.buffer.ChannelBuffer;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.handler.codec.replay.ReplayingDecoder;
import org.jboss.netty.handler.codec.replay.VoidEnum;

public final class Decoder extends ReplayingDecoder<VoidEnum> {
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