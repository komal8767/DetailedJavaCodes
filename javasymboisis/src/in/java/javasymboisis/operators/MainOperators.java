package in.java.javasymboisis.operators;

public class MainOperators {
	public static void main(String[] args) {
		Operators arithmetic=new Operators();
		System.out.println("Addition is:"+arithmetic.performAddition());
		Operators arithmetic1=new Operators(70,20);
		System.out.println("Subtraction is:"+arithmetic1.performSubtract());
		System.out.println("Multiplication is:"+arithmetic1.performMul());
		System.out.println("Division is:"+arithmetic1.performDiv());
		arithmetic.setNum1(10);
	    System.out.println("Left shift:"+arithmetic.performLeftShiftOnNum1(2));
	    arithmetic.setNum2(20);
	    System.out.println("Right shift:"+arithmetic.performRightShiftOnNum2(2));
	    
		
	}

}
