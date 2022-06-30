package corejava;

/**
 * @author Nandha
 *
 */
public class StringExample {

	
	public static void main(String[] args) {
		String a = " Hello";
		a+=" world ";
		a=a.trim();
		a=a.substring(1,3);
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder();
		sb.append("Hi");
		int n = sb.capacity();
		sb.reverse();
		System.out.println(sb.toString()+" "+ n);
	}

}