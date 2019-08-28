package hash_algorithms;

import java.security.MessageDigest;

public class SHA1Demo {

	public String sha1(String input) {
		
		StringBuffer message=new StringBuffer();
		
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] hash = md.digest(input.getBytes("UTF-8"));

			
			for (byte w : hash) {
				message.append(String.format("%02x", w));
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}

		return message.toString();

	}
		
}
