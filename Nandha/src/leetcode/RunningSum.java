package leetcode;

import java.util.Arrays;
import java.util.logging.Level;
import util.Loggr;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]

 * 
 * @author Nandhakumar Subramanian
 *
 */


public class RunningSum {
	private static final String CLASS_NAME = RunningSum.class.getName();
	
	int[] runningSum(int[] nums) {
		final String methodName = "runningSum";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
 		for (int i = 1; i < nums.length; i++) {
			nums[i] = nums[i-1] + nums[i];
		}
 		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return nums;    
    }
	
	public static void main(String[] args) {
		int[] q = {3,1,2,10,1};
		RunningSum rs = new RunningSum();
		q = rs.runningSum(q);
		System.out.println(Arrays.toString(q));
	}
}
