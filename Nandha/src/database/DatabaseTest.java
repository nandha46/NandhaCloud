package database;

import java.util.Scanner;

public class DatabaseTest {

	public static void main(String[] args) {
		String line;
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			line = sc.nextLine();
			sb.append(line);
		}
		sc.close();
	}

}
