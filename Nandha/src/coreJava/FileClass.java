/**
 * 
 */
package coreJava;

import java.io.File;
import java.io.IOException;

/**
 * @author nandha-con426
 *
 */
public class FileClass {

	
	public static void main(String[] args) throws IOException {
		String name = "/home/local/ZOHOCORP/nandha-con426/Documents/tutorial/hello.txt";
		
		File f = new File(name);
		f.createNewFile();
		System.out.println(name);

	}

}
