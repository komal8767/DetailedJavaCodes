package in.java.factorial;

import java.util.Scanner;

public class MainNumberFactorial {
	public static void main(String[] args) {
		NumberFactorial obj=new NumberFactorial();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to calculate factorial:");
		int no=sc.nextInt();
		System.out.println("factorial is: "+ obj.printFactorial(no));
	}

}
