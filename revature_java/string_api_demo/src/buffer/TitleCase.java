package buffer;

public class TitleCase {

	public static void main(String[] args) {
		String s="hello hii feeling drowsy? hey good god abc xyz";
		//expected output - Hello Hii Feeling Drowsy?
		StringBuilder sb=new StringBuilder();
		String ar[]=s.split(" ");
		for (int i = 0; i < ar.length; i++) {
			sb.append(Character.toUpperCase(ar[i].charAt(0))).append(ar[i].substring(1)).append(" ");
		}
		System.out.println(sb.toString().trim());
		
		
		StringBuilder sb1=new StringBuilder();
		for (int i = 0; i < ar.length; i++) {
			if(ar[i].length()%2==0) {
				sb1.append(ar[i]);
			}else {
				char c[]=ar[i].replaceAll("[^a-zA-Z0-9]", "").toCharArray();
				c[c.length/2]=Character.toUpperCase(c[c.length/2]);
				sb1.append(new String(c));
			}
			sb1.append(" ");
		}
		System.out.println(sb1.toString().trim());
	}
	
	

	

}

//try with last character
//if the word's length is odd then convert middle character to uppercase