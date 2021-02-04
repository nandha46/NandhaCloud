package Leetcode;

import java.util.logging.Level;

import util.Loggr;

/**
 * 
 * @author Nandhakumar Subramanian
 * <b>Problem:</b>
 * <p>Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].</p>
 *
 * <p>Return the array in the form [x1,y1,x2,y2,...,xn,yn].</p>

 
<p>
Example 1:<pre>
		Input: nums = [2,5,1,3,4,7], n = 3
		Output: [2,3,5,4,1,7] </p> 
<p>Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].</p>
<p>Example 2:
		Input: nums = [1,2,3,4,4,3,2,1], n = 4
		Output: [1,4,2,3,3,2,4,1]
</pre></p>
 */
public class ShuffleArray {
	private static final String CLASS_NAME = ShuffleArray.class.getName();

	public int[] shuffle(int[] nums, int n) {
		final String methodName = "shuffle";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		int size = 2*n;
		int[] ans = new int[size];
		return ans;
	}

	public static void main(String[] args) {

	}

}
