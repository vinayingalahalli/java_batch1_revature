package buffer;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hii feeling drowsy?";
		//expected output - Hello Hii Feeling Drowsy?
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}

//try with last character
//if the word's length is odd then convert middle character to uppercase