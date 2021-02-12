package leetcode;

public class ShuffleString {
	String restoreString(String s, int[] indices) {
		char[] ch = new char[s.length()];
		for (int i =0; i < ch.length; i++) {
			ch[indices[i]] = s.charAt(i);
		}
    return new String(ch);
    }
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = {4,5,6,7,0,2,1,3};
		ShuffleString ss = new ShuffleString();
		System.out.println(ss.restoreString(s, indices));
	}
}