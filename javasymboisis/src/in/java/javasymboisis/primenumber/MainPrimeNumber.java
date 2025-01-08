package in.java.javasymboisis.primenumber;

import java.util.Scanner;

public class MainPrimeNumber {
	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime:");
		int num=sc.nextInt();
		obj.setNumber(num);
		System.out.println("Number is "+obj.getNumber());
		if(obj.isPrimeNumber()) 
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
		
		
		sc.close();
	}

}
