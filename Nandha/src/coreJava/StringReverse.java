package coreJava;

import java.util.Scanner;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class StringReverse {
	/**
	 * String reversal using charAt method
	 */
	static String input;
	static StringBuilder output = new StringBuilder();

	void reverseCharAt(String input) {
		System.out.println(input.length());
		for (int i = 1; i <= input.length(); i++) {
			output.append(input.charAt(input.length() - i));
		}
		System.out.println("By charAt: "+output);

	}

	void reverseSubStr(String input) {
		int i = input.length() - 1;
		while (i <= input.length()) {
			output.append(input.substring(i, i++));
		}
		System.out.println("By substring: "+output);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		scan.close();
		StringReverse rev = new StringReverse();
		rev.reverseCharAt(input);
		rev.reverseSubStr(input);
	}

}