package opencgd.server.util.logging;

import org.grlea.log.SimpleLogger;
import org.jboss.netty.logging.InternalLogger;
import org.jboss.netty.logging.InternalLoggerFactory;

public class SimpleLoggerFactory extends InternalLoggerFactory {
	
	private static final SimpleLogger LOGGER = new SimpleLogger(SimpleLoggerFactory.class);

	/**
	 * {@inheritDoc}
	 */
	@Override
	public InternalLogger newInstance(String name){
		try {
			return new SimpleLogAdapter(new SimpleLogger(Class.forName(name)));
		} catch(ClassNotFoundException e){
			LOGGER.error("Failed to replace logger");
			LOGGER.errorException(e);
			return null;
		}
	}
}