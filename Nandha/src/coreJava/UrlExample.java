package coreJava;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class UrlExample {

	public static void main(String[] args) {
		try{  
			URL url=new URL("http://www.google.com");  
			URLConnection urlcon=url.openConnection();  
			InputStream stream=urlcon.getInputStream();  
			int i;  
			while((i=stream.read())!=-1){  
			System.out.print((char)i);  
			}  
			}catch(Exception e){System.out.println(e);}
	}

}
