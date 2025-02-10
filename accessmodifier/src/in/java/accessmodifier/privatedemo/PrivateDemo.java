package in.java.accessmodifier.privatedemo;

public class PrivateDemo {
	private String msg;
	private void printMsg() {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		PrivateDemo obj=new PrivateDemo();
		obj.printMsg();
	}

}
