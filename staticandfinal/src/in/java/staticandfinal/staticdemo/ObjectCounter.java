package in.java.staticandfinal.staticdemo;

public class ObjectCounter {
	static int count;
	public ObjectCounter() {
		count++;
	}
	public static void printCount() {
		System.out.println("Object count is:"+count);
	}

}
