package opencgd.server.util.logging;

import org.jboss.netty.util.ThreadNameDeterminer;

public class NameDeterminer implements ThreadNameDeterminer {

	/**
	 * {@inheritDoc}
	 */
	public String determineThreadName(String currentThreadName, String proposedThreadName) throws Exception {
		return currentThreadName;
	}
}