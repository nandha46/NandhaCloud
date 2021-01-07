package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class TruckMax {

	public int maximunUnits(int[][] boxTypes, int truckSize) {
		int capacity, max, ans=0;
		max = boxTypes[0][1];
		capacity = boxTypes[0][0];
		for (int i = 0; i < boxTypes.length; i++) {
			System.out.println(boxTypes[i][1]);
			if (max < boxTypes[i][1]) {
				max = boxTypes[i][1];
				capacity = boxTypes[i][0];
			}
		}
		if (capacity <= truckSize) {
			ans = max * capacity;
		}
		return ans;
	}
	
	Comparator<K,V> c = new Comparator<T>() {
	
	};
	public int maximumUnits(int[][] boxTypes, int truckSize) {
        //strategy: Greedy
        //sort by decreasing units
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int index = 0, answer = 0;
        //continue to add boxes until there is no more space or there are no more boxes
        while (truckSize != 0 && index != boxTypes.length) {
            //find remaining amt 
            int remaining = Math.min(truckSize, boxTypes[index][0]);
            //add to answer
            answer += remaining * boxTypes[index++][1];
            //update truck size
            truckSize -= remaining;
        }
        return answer;
    }


	public static void main(String[] args) {
		int[][] boxTypes = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
		int truckSize = 10;
		TruckMax tmax = new TruckMax();
		int ans = tmax.maximunUnits(boxTypes, truckSize);
		int ans2 = tmax.maximumUnits(boxTypes, truckSize);
		System.out.println(ans); // 91
		System.out.println(ans2);

	}
}
