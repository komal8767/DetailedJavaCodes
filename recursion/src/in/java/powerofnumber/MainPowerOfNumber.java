package in.java.powerofnumber;

import java.util.Scanner;

import in.java.factorial.NumberFactorial;

public class MainPowerOfNumber {
	public static void main(String[] args) {
		PowerOfNumber obj=new PowerOfNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to calculate power of number:");
		int no=sc.nextInt();
		System.out.println("Enter power of number:");
		int power=sc.nextInt();
		System.out.println("result is: "+ obj.printPower(no,power));
	}

}
