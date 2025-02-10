package in.java.fibonacciseries;

public class FibonaccciSeries {
	int sum=0;
	public void printSeries(int num1, int num2, int limit) {
		sum=num1+num2;
		System.out.print(sum+" ");
		num1=num2;
		num2=sum;
		if(limit>=1)
			printSeries(num1,num2,limit-1);
		
		
		
		
		
	}

}
