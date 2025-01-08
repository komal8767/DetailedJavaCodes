package in.java.javasymboisis.operators;

public class Operators {
	int num1;
	int num2;
	public Operators() {
		num1=2;
		num2=4;
		
	}
	public Operators(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum1(){  //methods written to modify default values of reference variable
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public int performAddition() {
		return num1+num2;
	}
	public int performSubtract() {
		return num1-num2;
	}
	public int performMul() {
		return num1*num2;
	}
	public int performDiv() {
		return num1/num2;
	}
	public int performModulo() {
		return num1%num2;
	}
	public int performLeftShiftOnNum1(int position) {
		return num1<<position;
	}
	public int performRightShiftOnNum2(int position) {
		return num2>>position;
	}


}
