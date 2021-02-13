package leetcode;
/**
 * @author Nandhakumar Subramanian
 */
import java.util.Arrays;
import java.util.logging.Level;

import util.Loggr;

public class DecodeXORArray {
	private static final String CLASS_NAME = DecodeXORArray.class.getName();
	
	int[] decode(int[] encoded, int first) {
		final String methodName = "decode";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, null);
		int[] ans = new int[encoded.length + 1];
		ans[0] = first;
		for (int i = 1; i < encoded.length + 1; i++) {
			ans[i] = encoded[i-1] ^ first;
			first = ans[i];
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, null);
		return ans;
	}

	public static void main(String[] args) {
		DecodeXORArray dxa = new DecodeXORArray();
		int[] encoded = {6};
		int first = 1;
		System.out.println(Arrays.toString(dxa.decode(encoded, first)));
	}
}