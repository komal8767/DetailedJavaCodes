package in.java.javasymboisis.mainudrivenprogram.presentationlayer;
import java.util.Scanner;
import in.java.javasymboisis.numberoperation.ReverseNum;
import in.java.javasymboisis.perfectnumber.PerfectNumber;
import in.java.javasymboisis.primenumber.PrimeNumber;
import in.java.javasymboisis.armstrongnumber.ArmstrongNumber;
public class Helper {
	public int printMenu(Scanner sc) {
		System.out.println("1.Check Palindrome");
		System.out.println("2.Check Armstrong");
		System.out.println("5.Check Perfect");
		System.out.println("4.Check Prime");
		System.out.println("0.To exit....");
		System.out.println("Enter option:");
		return sc.nextInt();
	}
	public void checkPalindrome(Scanner sc) {
		ReverseNum obj=new ReverseNum();
		System.out.println("Enter a number:");
		long variable=sc.nextInt();
		obj.setNum(variable);
		obj.printReverse();
		
	}
	
	public void checkArmstrongNo(Scanner sc) {
		ArmstrongNumber obj=new ArmstrongNumber();
		System.out.println("Enter number to check armstrong:");
		int num=sc.nextInt();
		obj.setNumber(num);
		if(obj.isArmstrongNo()) 
			System.out.println(num+" is Armstrong number");
		else
			System.out.println(num+" is not Armstrong number");	
	}
	
	public void checkPerfect(Scanner sc) {
		PerfectNumber obj=new PerfectNumber();
		System.out.println("Enter number to check perfect:");
		int num=sc.nextInt();
		obj.setNumber(num);
		if(obj.isPerfectNo())
			System.out.println(num+" is perfect No");
		else
			System.out.println(num+" is not a perfect No");
	}
	
	public void checkPrime(Scanner sc) {
		PrimeNumber obj=new PrimeNumber();
		System.out.println("Enter number to check perfect:");
		int num=sc.nextInt();
		obj.setNumber(num);
		if(obj.isPrimeNumber()) 
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");
		
	}

}
