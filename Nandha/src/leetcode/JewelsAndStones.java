package leetcode;
/**
 * <pre>
 * You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "a" is considered a different type of stone from "A".

 

Example 1:

Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

Example 2:

Input: jewels = "z", stones = "ZZ"
Output: 0

 * </pre>
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class JewelsAndStones {
	 int numJewelsInStones(String jewels, String stones) {
		 int ans = 0;
		 char[] jewelArray = jewels.toCharArray();
		 char[] stoneArray = stones.toCharArray();
		 for (char a : jewelArray) {
			 for (char b : stoneArray) {
				 if (a == b )
					 ans++;
			 }
		 }
		 return ans;
	    }
	public static void main(String[] args) {
		JewelsAndStones jas = new JewelsAndStones();
		String jewels = "aA", stones = "aAAbbbb";
		System.out.println("Number of Stones that are Jewels: " + jas.numJewelsInStones(jewels, stones));
	}

}
