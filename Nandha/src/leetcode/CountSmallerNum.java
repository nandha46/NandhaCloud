package leetcode;

import java.util.Arrays;
import java.util.logging.Level;

import util.Loggr;

/**
 * @author Nandhakumar Subramanian
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
