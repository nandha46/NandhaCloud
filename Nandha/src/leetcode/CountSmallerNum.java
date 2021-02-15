package leetcode;

import java.util.Arrays;
import java.util.logging.Level;

import util.Loggr;

/**
 * <pre>
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.

 

Example 1:

Input: nums = [8,1,2,2,3]
Output: [4,0,1,1,3]
Explanation: 
For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
For nums[1]=1 does not exist any smaller number than it.
For nums[2]=2 there exist one smaller number than it (1). 
For nums[3]=2 there exist one smaller number than it (1). 
For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
Example 2:

Input: nums = [6,5,4,8]
Output: [2,1,0,3]
Example 3:

Input: nums = [7,7,7,7]
Output: [0,0,0,0]

 * </pre>
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class CountSmallerNum {
	private static final String CLASS_NAME = CountSmallerNum.class.getName();
	
	int[] smallerNumbersThanCurrent(int[] nums) {
		final String methodName = "smallerNumbersThanCurrent";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		int[] ans = new int[nums.length];
		for (int i =0; i < nums.length; i++) {
			int temp = 0 ;
			for (int b : nums) {
				if (nums[i] > b)
					temp++;
			}
			ans[i] = temp;
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return ans;    
    }
	public static void main(String[] args) {
		int[] nums = {7,7,7,7};
		CountSmallerNum csn = new CountSmallerNum();
		System.out.println(Arrays.toString(csn.smallerNumbersThanCurrent(nums)));
	}

}