package file_byte_demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInByteDemo {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("bytedemo.txt"); // try with resources
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			System.out.println("Available bytes before read " + bis.available());
			// System.out.println((char)bis.read());
			StringBuilder sb = new StringBuilder();
			while (bis.available() != 0) {
				sb.append((char) bis.read());
			}

			System.out.println("Available byes fter read " + bis.available());
			System.out.println("Info read from the file is");
			System.out.println(sb);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
