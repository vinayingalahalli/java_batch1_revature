package example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.pojo.CreditCard;

public class DeSerializeMain {

	public static void main(String[] args) {
		
		try(
		FileInputStream fis=new FileInputStream("serialize.txt");
				ObjectInputStream ois=new ObjectInputStream(fis);
				){
			CreditCard cc=(CreditCard) ois.readObject();
			System.out.println("Data deserialized is ");
			System.out.println(cc);
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} 

	}

}
