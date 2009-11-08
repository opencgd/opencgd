package opencgd.server.util.logging;

import org.grlea.log.DebugLevel;
import org.grlea.log.SimpleLogger;
import org.jboss.netty.logging.InternalLogLevel;
import org.jboss.netty.logging.InternalLogger;

class SimpleLogAdapter implements InternalLogger {
	
	private final SimpleLogger logger;
	
	SimpleLogAdapter(SimpleLogger logger){
		this.logger = logger;
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String msg){
		logger.debug(msg);
	}

	/**
	 * {@inheritDoc}
	 */
	public void debug(String msg, Throwable cause){
		logger.debugObject(msg, cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public void error(String msg){
		logger.error(msg);
	}

	/**
	 * {@inheritDoc}
	 */
	public void error(String msg, Throwable cause){
		logger.error(msg);
		logger.errorException(cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String msg){
		logger.info(msg);
	}

	/**
	 * {@inheritDoc}
	 */
	public void info(String msg, Throwable cause){
		logger.infoObject(msg, cause);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isDebugEnabled(){
		return logger.wouldLog(DebugLevel.L5_DEBUG);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isEnabled(InternalLogLevel level){
		switch(level){
		case INFO:
			return logger.wouldLog(DebugLevel.L4_INFO);
			
		case WARN:
			return logger.wouldLog(DebugLevel.L3_WARN);
			
		case DEBUG:
			return logger.wouldLog(DebugLevel.L5_DEBUG);
			
		case ERROR:
			return logger.wouldLog(DebugLevel.L2_ERROR);
			
		default:
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isErrorEnabled(){
		return logger.wouldLog(DebugLevel.L2_ERROR);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isInfoEnabled(){
		return logger.wouldLog(DebugLevel.L4_INFO);
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isWarnEnabled(){
		return logger.wouldLog(DebugLevel.L3_WARN);
	}

	/**
	 * {@inheritDoc}
	 */
	public void log(InternalLogLevel level, String msg){
		switch(level){
		case INFO:
			info(msg);
			break;
			
		case WARN:
			warn(msg);
			break;
			
		case DEBUG:
			debug(msg);
			break;
			
		case ERROR:
			error(msg);
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void log(InternalLogLevel level, String msg, Throwable cause){
		switch(level){
		case INFO:
			info(msg, cause);
			break;
			
		case WARN:
			warn(msg, cause);
			break;
			
		case DEBUG:
			debug(msg, cause);
			break;
			
		case ERROR:
			error(msg, cause);
			break;
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String msg){
		logger.warn(msg);
	}

	/**
	 * {@inheritDoc}
	 */
	public void warn(String msg, Throwable cause){
		logger.warn(msg);
		logger.warnException(cause);
	}
}