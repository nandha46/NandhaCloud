package Leetcode;

import java.util.logging.Level;

import util.Loggr;

/**
 * 
 * @author Nandhakumar Subramanian
 * 
 * <pre>
 *Problem :
 *
 * Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.

 

Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.

Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.

Example 3:

Input: nums = [1,2,3]
Output: 0

 * </pre>
 *
 */
public class GoodPairs {
	private static final String CLASS_NAME = GoodPairs.class.getName();
	
	int numIdenticalPairs(int[] nums) {
		final String methodName = "numIdenticalPairs";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		int answer = 0 ;
		for (int i = 0; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) 
					answer++;
		}
			}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return answer;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		int ans;
		GoodPairs goodpairs = new GoodPairs();
		ans = goodpairs.numIdenticalPairs(nums);
		System.out.println("Number of GoodPairs: "+ ans);
	}

}
