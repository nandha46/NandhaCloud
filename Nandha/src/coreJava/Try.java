package coreJava;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class Try {

	public static void main(String[] args) {
		// Code that prints every 498th word
		int j=0;
		for(int i=0;i<2665;i++) {
			if(i%498==0) {
			j++;	
			System.out.println(j);
			}
		}
	}
}