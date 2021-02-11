package leetcode;
/**
 * @author Nandhakumar Subramanian
 */
import java.util.Arrays;

public class DecodeXORArray {

	int[] decode(int[] encoded, int first) {
		int[] ans = new int[encoded.length + 1];
		ans[0] = first;
		for (int i = 1; i < encoded.length + 1; i++) {
			ans[i] = encoded[i-1] ^ first;
			first = ans[i];
		}
		return ans;
	}

	public static void main(String[] args) {
		DecodeXORArray dxa = new DecodeXORArray();
		int[] encoded = {6};
		int first = 1;
		System.out.println(Arrays.toString(dxa.decode(encoded, first)));
	}

}