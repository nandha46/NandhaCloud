package leetcode;
/**
 * @author Nandhakumar Subramanian
 */
import java.util.Arrays;
import java.util.logging.Level;

import util.Loggr;

public class TruckMax {
	private static final String CLASS_NAME = TruckMax.class.getName();
	
	public int maximunUnits(int[][] boxTypes, int truckSize) {
		final String methodName = "maximumUnits";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, new Object[0]);
		int ans=0;
		int index=0;
		Arrays.sort(boxTypes, (x,y)->y[1]-x[1]);
		while(truckSize != 0 && index != boxTypes.length) {
			int balance = Math.min(truckSize, boxTypes[index][0]);
			ans += balance * boxTypes[index++][1];
			truckSize -= balance;
		}
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, new Object[0]);
		return ans;
	}

	public static void main(String[] args) {
		final String methodName = "main";
		Loggr.logMessage(Loggr.METHOD_ENTRY, Level.INFO, CLASS_NAME, methodName, new Object[0]);
	//	int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int[][]	boxTypes = {{1,3}, {2,2}, {3,1}};
		int truckSize = 4;
		TruckMax tmax = new TruckMax();
		int ans = tmax.maximunUnits(boxTypes, truckSize);
		System.out.println(ans); // 91
		Loggr.logMessage(Loggr.METHOD_EXIT, Level.INFO, CLASS_NAME, methodName, new Object[0]);
	}
}
