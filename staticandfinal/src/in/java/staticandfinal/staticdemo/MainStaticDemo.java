package in.java.staticandfinal.staticdemo;
//when class loads jvm allocates memory to static variables
public class MainStaticDemo {
	public static void main(String[] args) {
		StaticDemo object=new StaticDemo();
//		object.setVar(10);
		System.out.println(object);
		StaticDemo.setVar(20);
		System.out.println("Variable Value:"+StaticDemo.getVar());
		System.out.println("Static in non-Static:");
		object.printVariable();
		System.out.println("Non-Static in static:");
		StaticDemo.print();
	}

}
