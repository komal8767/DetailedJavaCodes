package in.java.accessmodifier.testdefault_protected;

import in.java.accessmodifier.protecteddemo.ProtectedDemo;

public class TestProtected extends ProtectedDemo{
	public static void main(String[] args) {
		TestProtected obj=new TestProtected();
		obj.name="Komal";
		obj.printName();
	}
	

}
