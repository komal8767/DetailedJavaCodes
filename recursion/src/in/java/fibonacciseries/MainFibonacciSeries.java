package in.java.fibonacciseries;
import java.util.Scanner;
public class MainFibonacciSeries {
	public static void main(String[] args) {
		FibonaccciSeries obj=new FibonaccciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit to print series:");
		int limit=sc.nextInt();
		System.out.println(new FibonacciSeries1().printSeries1(limit));
//		System.out.print("0 1 ");
//		obj.printSeries(0,1,limit-3);
		
		
		
	}
	
	
	

}
