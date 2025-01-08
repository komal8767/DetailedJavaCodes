package in.java.javasymboisis.fibonacciseries;
import java.util.Scanner;

public class MainFibonacciSeries {
	public static void main(String[] args) {
		FibonacciSeries series=new FibonacciSeries();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int limit=sc.nextInt();
		series.setLimit(limit);
		series.printFibonacciSeries();
		sc.close();
		
	}

}
