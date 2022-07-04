package corejava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	
	 static Map<String, Integer> phoneBook = new HashMap<>();
	 
	 public static void main(String Args[]) {
		 
		 Scanner in = new Scanner(System.in);
		 
			 int n = in.nextInt();
		 for(int i=0;i<n;i++) {
			 String name = in.next();
			 int phone = in.nextInt();
			 phoneBook.put(name,phone);
		 }
		 while(in.hasNext()) {
			 String name = in.next();
			 if(phoneBook.containsKey(name)) {
			int pNumber =  phoneBook.get(name);
			 System.out.println(name+"="+pNumber);
			 }
			 else {
				 System.out.println("Not found");
			 }
		 }in.close();
	 }
}
