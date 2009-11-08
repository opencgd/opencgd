package opencgd.server.util;

import java.util.ArrayList;
import java.util.List;

public class DefaultLoginValidator implements ILoginValidator {
	
	private static final boolean CACHE_MODE = false;
	private final List<String> testCache = new ArrayList<String>();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean isLoginCorrect(String username, String password){
		return (testCache.contains(username) && CACHE_MODE) || !CACHE_MODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean doesAccountExist(String username){
		return (testCache.contains(username) && CACHE_MODE) || !CACHE_MODE;
	}

	@Override
	public void createAccount(String username, String password){
		testCache.add(username);
	}
}