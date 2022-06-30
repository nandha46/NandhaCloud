package corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class Try {

	public static int checkRegNum(int i) {
		String tmp = String.valueOf(i);
		String[] arr = tmp.split("");
		int value = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]) + Integer.parseInt(arr[2])
				+ Integer.parseInt(arr[3]);
		String tmp2 = String.valueOf(value);
		String[] arr2 = tmp2.split("");
		int value2 = Integer.parseInt(arr2[0]) + Integer.parseInt(arr2[1]);
		if (value2 < 10) {
			if (value2 == 1 || value2 == 5) {
				return i;
			} else if (value2 == 9) {
				return i;
			} else {
				return 0;
			}
		} else {
			String tmp3 = String.valueOf(value2);
			String[] arr3 = tmp3.split("");
			int value3 = Integer.parseInt(arr3[0]) + Integer.parseInt(arr3[1]);
			if (value3 < 10) {
				if (value3 == 1 || value3 == 5) {
					return i;
				} else if (value3 == 9) {
					return i;
				} else {
					return 0;
				}

			} 
		}

		return 0;
	}

	public static void carNumbers() {
		System.out.println("Car Numbers: ");
		for (int i = 6500; i < 7000; i++) {
			int number = checkRegNum(i);
			if (number == 0) {
				//
			} else {
				System.out.println(number);
			}
		}
	}

	public static void main(String[] args) {
	/*	carNumbers();
		Double d2, tmp;
		d2 = 3000d;
		tmp = 3400d;
		d2 = d2 - tmp;
		System.out.println(d2); */
		
		String[] array = {"abc", "2", "10", "0"};
		List<String> list = Arrays.asList(array);
		Collections.sort(list);
		System.out.println(Arrays.toString(array));

	}

}
