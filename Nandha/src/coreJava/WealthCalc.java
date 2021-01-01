package coreJava;

import java.util.Arrays;

public class WealthCalc {

	    public int maximumWealth(int[][] accounts) {
	        int[] wealth = new int[accounts.length];
	        int sum=0;
	        for(int i=0;i<accounts.length;i++){
	            int n = accounts[i].length;
	            sum=0;
	            for(int j=0;j<n;j++){
	                sum+=accounts[i][j];
	                if(j==n-1){
	                    wealth[i]=sum;
	                }
	            }
	        }
	        int max = wealth[0];
	        for(int i=1;i<wealth.length;i++) {
	        	if(max<wealth[i]) {
	        		max=wealth[i];
	        	}
	        }
	        return max;
	      //  Arrays.sort(wealth);
	      //  return wealth[wealth.length-1];
	    }
	    
	public static void main(String[] args) {
			WealthCalc wc = new WealthCalc();
			int[][] acc = {{2,8,7},{7,1,3},{1,9,5}};
			long start = System.nanoTime();
			int wealth = wc.maximumWealth(acc);
			long end = System.nanoTime();
			long duration = end - start;
			System.out.println(duration);
			System.out.println(wealth);
	}
}
