package in.java.staticandfinal.staticdemo;
//outer class and constructor cannot defined STATIC
//memory management
public class StaticDemo {
	static int variable;
	public static void setVar(int variable) {
		StaticDemo.variable=variable;
	}
	static {
		variable=10;
	}
	public static int getVar() {
		setVar(10);
		//printVariable(); //we cannot access non-static method in static
		return variable;
	}
	public void printVariable() {
		setVar(20); //we can access static in non-static
		System.out.println(variable);
	}
	public static void print() {
		StaticDemo s=new StaticDemo();
		s.printVariable(); //but we can access by creating object
	}

}
