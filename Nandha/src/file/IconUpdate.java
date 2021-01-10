package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class IconUpdate {

	private static void goDeep(File file) {
		FilenameFilter filter = (dir, name) -> !name.contains(".");
		FilenameFilter iniFilter = (dir, name) -> name.matches("desktop.ini");
		boolean flag = false;
		HashMap<File, Boolean> folderMap;
		//TODO add folders to the map and flag as flase
		//once visited the folder mark it as true
		//move the file pointer to one level up
		// TO avoid loop inside last depth
		if (file.isDirectory()) {
			File[] folders = file.listFiles(filter);
			for (File folder : folders) {
				System.out.println(folder.getAbsolutePath());
				File[] desktopIni = folder.listFiles(iniFilter);
				if (desktopIni.length != 0) {
					System.out.println(desktopIni[0].getName());
				}
				while (folder.listFiles(filter).length != 0) {
					goDeep(folder);
				}
			}
		} else {
			System.out.println("It's a file");
		}
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		System.out.println("------------------------");
		File file = new File("C:\\Users\\nandh\\Downloads");
		goDeep(file);
	}
}
