package coreJava;

public class Program {

	public static void main(String[] args) {
		System.out.println("main is starting");
		A p1 = new A(7);
		System.out.println("p1 object creation completed");
		A p2 = new A(p1);
		System.out.println(p1.x+p2.x);
	}

}
class A {
	int x;
	A (A p){
		p.x=3;
		x=9;
		System.out.println("inside Object Arg constructor. Now X is  "+ x);
	}
A (int x){
	System.out.println("inside int Arg constructor. Now x is "+ x);
	this.x=x;
}
}