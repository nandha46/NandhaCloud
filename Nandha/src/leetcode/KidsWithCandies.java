package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;

import util.Loggr;

/**<pre>
 * Given the array candies and the integer extraCandies, where candies[i]
 * represents the number of candies that the ith kid has.
 * 
 * For each kid check if there is a way to distribute extraCandies among the
 * kids such that he or she can have the greatest number of candies among them.
 * Notice that multiple kids can have the greatest number of candies.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: candies = [2,3,5,1,3], extraCandies = 3 
 * Output:[true,true,true,false,true] 
 * 
 * Explanation: Kid 1 has 2 candies and if he or she
 * receives all extra candies (3) will have 5 candies --- the greatest number of
 * candies among the kids. Kid 2 has 3 candies and if he or she receives at
 * least 2 extra candies will have the greatest number of candies among the
 * kids. Kid 3 has 5 candies and this is already the greatest number of candies
 * among the kids. Kid 4 has 1 candy and even if he or she receives all extra
 * candies will only have 4 candies. Kid 5 has 3 candies and if he or she
 * receives at least 2 extra candies will have the greatest number of candies
 * among the kids. 
 * 
 * Example 2:
 * 
 * Input: candies = [4,2,1,1,2], extraCandies = 1 
 * Output:
 * [true,false,false,false,false] 
 * 
 * Explanation: There is only 1 extra candy,
 * therefore only kid 1 will have the greatest number of candies among the kids
 * regardless of who takes the extra candy. Example 3:
 * 
 * Input: candies = [12,1,12], extraCandies = 10 
 * Output: [true,false,true]
 * </pre>
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class KidsWithCandies {
	private static final String CLASS_NAME = KidsWithCandies.class.getName();
	
	List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		final String methodName = "kidsWithCandies";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		List<Boolean> ans = new ArrayList<Boolean>(candies.length);
		// Getting max of int Array using Stream
		int max = Arrays.stream(candies).max().getAsInt();
		for (int candy : candies) {
			ans.add(candy + extraCandies >= max);
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return ans;
	}

	public static void main(String[] args) {
		int[] candies = { 4,2,1,1,2 };
		int extraCandies = 1;
		KidsWithCandies kwc = new KidsWithCandies();
		List<Boolean> ans = kwc.kidsWithCandies(candies, extraCandies);
		System.out.println(ans.toString());
	}
}
