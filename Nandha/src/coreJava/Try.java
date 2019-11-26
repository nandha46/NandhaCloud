package coreJava;

public class Try {

	public static void main(String[] args) {
		// Code that prints every 498th word
		int i; int j=0;
		for(i=0;i<2665;i++) {
			if(i%498==0) {
			j++;	System.out.println(j);
			}
		}
	}

}