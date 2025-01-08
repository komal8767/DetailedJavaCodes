package in.java.javasymboisis.fibonacciseries;

public class FibonacciSeries {
	int limit;
	public FibonacciSeries() {
		
	}
	public FibonacciSeries(int limit) {
		this.limit=limit;
	}
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public void printFibonacciSeries() {
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		int sum=0;
		for(int i=1;i<=limit-2;i++) {
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum+" ");
		}
	}

}
