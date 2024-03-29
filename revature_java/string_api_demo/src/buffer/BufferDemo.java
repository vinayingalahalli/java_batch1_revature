package buffer;

public class BufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		sb.append(" heyy").append(false).append('v').append(19999).append(123.667777);
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.charAt(9));
		sb.insert(1, "java");
		System.out.println(sb);
		sb.delete(5, 8);
		System.out.println(sb);
		sb.deleteCharAt(0);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer("java");
		StringBuffer sb2=new StringBuffer("java");
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
	}

}
