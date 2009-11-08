package opencgd.server.util;

import java.util.Arrays;

public class MiscUtil {

	public static byte[] encodeUsername(final String name){
		//Create a char[] full of spaces, which will be replaced by the actual characters in the username
		final char[] username = new char[12];
		Arrays.fill(username, ' ');
		
		for(int i = 0; i < name.length(); i++){
			username[i] = name.charAt(i);
		}
		
		return new String(username).getBytes();
	}
}