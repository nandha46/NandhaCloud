package coreJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSize {
	
	static String findSize(long length) {
		double size = length/1024;
		if (size<1) {
			System.out.println(size*1024+" B");
			return  size*1024 + " B";
		} else if(size>1 && size<1024){
			System.out.println(Math.round(size)+" KB");
			return Math.round(size)+" KB";
		} else if(size/1024>1 && size/1024 <1024) {
			System.out.println(Math.round(size/1024)+" MB");
			return Math.round(size/1024)+" MB";
		} else {
			size/=1024;
			System.out.println(String.format("%.2f",size/1024)+" GB");
			return String.format("%.2f",size/1024)+" GB";
		}
	}
		
	public static void main(String[] args) {
		File f = new File("C:\\Users\\nandh\\Downloads\\linkedlist.txt");
		File f2 = new File("C:\\Users\\nandh\\Downloads\\linkedlistCalc.txt");
		String fileSize;
		try {
		FileWriter writer = new FileWriter(f2);
		Scanner sc = new Scanner(f);
		
		while(sc.hasNext()) {
			fileSize = findSize(sc.nextLong());
			writer.append(fileSize+"\n");
		}
		sc.close();
		writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
