package coreJava;

public class FileSize {
	
	static void findSize(long length) {
		double size = length/1024;
		if (size<1) {
			System.out.println(size*1024+"B");
		} else if(size/1024<1){
			System.out.println(size+"KB");
s		} else if(size/1024<1) {
			System.out.println(size+"MB");
		} else {
			System.out.println(size+"GB");
		}
	}

	public static void main(String[] args) {
		
	//TODO Refactor by num<1 it is optimal
		
		long length =21474814L;
		findSize(length);
		double num = length/1024;
		if(num>1) {
			num=num/1024;
			if(num>1){
				num=num/1024;
				if(num>1){
					System.out.println(num+"GB");
				} else{
					System.out.println(num*1024+"MB");}
			} else{
				System.out.println(num*1024 +"KB");}

		} else {
			System.out.println(num+"B");
		}
	}
}
