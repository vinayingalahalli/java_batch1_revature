package hash_algorithms;

import java.security.MessageDigest;

public class MD5Demo {

	public String md5(String input) {
		
		// used to load the hexadecimal code output
		StringBuffer output=new StringBuffer();
		
		try {
			
			// make a MD5 MessageDigest object
			MessageDigest md = MessageDigest.getInstance("MD5");
			
			//converts input into byte array following UTF-8 conventions
			byte[] x = input.getBytes("UTF-8");
			
			//the algorithm is run and returns byte string in binary
			byte[] hash = md.digest(x);

			//converts each digit to hexadecimal
			for (byte w : hash) {
				output.append(String.format("%02x", w));
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}

		return output.toString();

	}
		
}
