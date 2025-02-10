package in.java.accessmodifier.defaultdemo;
//this class creates public method which is used to access default methods outside package
public class Helper {
	public void accessDefault1() {
		DefaultDemo1 demo1=new DefaultDemo1();
		demo1.printMsg1();
	}
	public void accessDefault2() {
		DefaultDemo2 demo2=new DefaultDemo2();
		demo2.printMsg2();
	}

}
