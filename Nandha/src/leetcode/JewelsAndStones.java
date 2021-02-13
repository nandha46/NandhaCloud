package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

import util.Loggr;

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
	private static final String CLASS_NAME = JewelsAndStones.class.getName();
	
	 int numJewelsInStones(String jewels, String stones) {
		 final String methodName = "numJewelsInStones";
		 Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		 int ans = 0;
		 Set<Character> set = new HashSet<Character>();
		 for (char a : jewels.toCharArray()) {
			set.add(a); 
		 }
		 for (char a : stones.toCharArray()) {
			 if (set.contains(a))
				 ans++;
		 }
		 Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		 return ans;
	    }
	public static void main(String[] args) {
		JewelsAndStones jas = new JewelsAndStones();
		String jewels = "aA", stones = "aAAbbbb";
		System.out.println("Number of Stones that are Jewels: " + jas.numJewelsInStones(jewels, stones));
	}

}
