package opencgd.server.util;

public interface ILoginValidator {

	boolean isLoginCorrect(String username, String password);
	boolean doesAccountExist(String username);
	void createAccount(String username, String password);
}