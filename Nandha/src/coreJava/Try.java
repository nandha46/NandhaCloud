package coreJava;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class Try {
	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<>();
		m.getOrDefault(1, 5);
 	}
}