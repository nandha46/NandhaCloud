package Leetcode;

import java.util.Arrays;

public class TruckMax {

	public int maximunUnits(int[][] boxTypes, int truckSize) {
		int ans=0;
		int index=0;
		Arrays.sort(boxTypes, (x,y)->y[1]-x[1]);
		while(truckSize != 0 && index != boxTypes.length) {
			int balance = Math.min(truckSize, boxTypes[index][0]);
			ans += balance * boxTypes[index++][1];
			truckSize -= balance;
		}
		return ans;
	}

	public static void main(String[] args) {
	//	int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int[][]	boxTypes = {{1,3}, {2,2}, {3,1}};
		int truckSize = 4;
		TruckMax tmax = new TruckMax();
		int ans = tmax.maximunUnits(boxTypes, truckSize);
		System.out.println(ans); // 91
	}
}
