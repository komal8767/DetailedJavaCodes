package in.java.javasymboisis.swapping;

class Swapping{
	int num1;
	int num2;
//	public Swapping() {
//		
//	}
	public Swapping(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public void swapUsingThirdVar() {
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
	}
	public void swapWithoutThirdVar() {
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
	}
	public void printNumber() {
		System.out.println("Number1:"+num1);
		System.out.println("number2:"+num2);
	}
}

