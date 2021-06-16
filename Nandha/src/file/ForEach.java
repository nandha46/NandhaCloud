package file;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
		
	public void method() {
		List<String> nameList = Arrays.asList("name1","234","fsdfg","sett");
		List<String> list2 = new ArrayList<String>();
		nameList.forEach(n->{
			list2.add(n.concat("-->"));
		});
		
		list2.forEach(s->System.out.println(s));
	}
	
	public static void main(String[] args) {
		ForEach fe = new ForEach();
		fe.method();
		
	}
}

class file2 {
	String name1;
	String name2;
	String name3;
	String name4;
	
}
