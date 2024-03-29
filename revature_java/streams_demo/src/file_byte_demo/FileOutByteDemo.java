package file_byte_demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutByteDemo {

	public static void main(String[] args) {
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		//String s="this message should be written inside the file...\nthis will be in new line..";
		String s="\nthis is new message";
		try {
			fos=new FileOutputStream("bytedemo.txt",true);
			bos=new BufferedOutputStream(fos);
			byte b[]=s.getBytes(); // converts message to bytes
			bos.write(b);
			System.out.println("Data written successfully");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				bos.flush();
				bos.close();
				fos.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		

	}

}
