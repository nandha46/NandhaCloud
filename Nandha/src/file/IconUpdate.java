package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class IconUpdate {
	private static final String CLASS_NAME = IconUpdate.class.getName();
	private static final String start = "METHOD_START";
	private static final String end = "METHOD END";
	private static final FilenameFilter filter = (dir, name) -> !name.contains(".");
	private static final FilenameFilter iniFilter = (dir, name) -> name.matches("desktop.ini");
	
	private static void listFolder(File file) {
		System.out.println(start+"\n");
		Scanner scanner;
		if (file.isDirectory()) {
			File[] folders = file.listFiles(filter);
			for (File folder : folders) {
				//System.out.println(folder.getAbsolutePath());
				File[] desktopIni = folder.listFiles(iniFilter);
				if (desktopIni.length != 0) {
					System.out.println(desktopIni[0].getAbsolutePath());
					try {
						scanner = new Scanner(desktopIni[0]);
						System.out.println(".........................");
						while (scanner.hasNext()) {
							System.out.println(scanner.next());
						}
						System.out.println("............................");
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					
				}
			}
		} else if(file.isFile()){
			System.out.println("It's a file");
		}
		
		else {
			System.out.println("Invalid Path");
		}
		System.out.println("\n"+end);
	}

	public static void main(String[] args) {
		File file = new File("C:\\Users\\nandh\\Downloads\\");
		listFolder(file);
	}
}
