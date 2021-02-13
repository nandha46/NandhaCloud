package leetcode;

import java.util.logging.Level;

import util.Loggr;

public class ShuffleString {
	private static final String CLASS_NAME = ShuffleString.class.getName();
	
	String restoreString(String s, int[] indices) {
		final String methodName = "restoreString";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		char[] ch = new char[s.length()];
		for (int i =0; i < ch.length; i++) {
			ch[indices[i]] = s.charAt(i);
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
    return new String(ch);
    }
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		ShuffleString ss = new ShuffleString();
		System.out.println(ss.restoreString(s, indices));
	}
}