package in.java.javasymboisis.numberseries;

import java.util.Scanner;

public class MainCubeSquareAlternate {
	public static void main(String[] args) {
		CubeSquareAlternate series=new CubeSquareAlternate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int limit=sc.nextInt();
		series.setLimit(limit);
		series.printSeries();
		sc.close();
	}

}
