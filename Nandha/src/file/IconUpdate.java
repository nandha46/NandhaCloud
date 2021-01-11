package file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Nandhakumar Subramanian
 *
 */
public class IconUpdate {
	private static Map<File, Boolean> folderMap = new HashMap<File, Boolean>();
	private static final  FilenameFilter filter = (dir, name) -> !name.contains(".");
	private static final FilenameFilter iniFilter = (dir, name) -> name.matches("desktop.ini");
	private static boolean flag = false;
	
	private static void listFolder(File file) {
		
		if (file.isDirectory()) {
			File[] folders = file.listFiles(filter);
			for (File folder : folders) {
				goDeep(folder);
			}
		} else {
			System.out.println("It's a file");
		}
		System.out.println("---------------");
	}

	private static void goDeep(File folder) {
		if (folderMap.containsKey(folder)) {
			folder = folder.getParentFile();
			if (folderMap.containsValue(true)) {
				folder.getParentFile();
			}
		}
		folderMap.put(folder, flag);
		System.out.println(folder.getAbsolutePath());
		File[] desktopIni = folder.listFiles(iniFilter);
		if (desktopIni.length != 0) {
			System.out.println(desktopIni[0].getName());
		}
		while (folder.listFiles(filter).length != 0) {
			folderMap.put(folder, true);
			goDeep(folder);
		}		
	}

	public static void main(String[] args) {
		System.out.println("------------------------");
		File file = new File("C:\\Users\\nandh\\Downloads\\Java\\test");
		listFolder(file);
	}
}
