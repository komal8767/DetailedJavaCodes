package in.java.javasymboisis.numberseries;

import java.util.Scanner;

public class MainAlternate {
	public static void main(String[] args) {
		Alternate series=new Alternate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int limit=sc.nextInt();
		series.setLimit(limit);
		series.printSeries();
		sc.close();
	}

}
