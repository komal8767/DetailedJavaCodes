package in.java.javasymboisis.armstrongnumber.main;

import java.util.Scanner;

import in.java.javasymboisis.armstrongnumber.ArmstrongNumber;

public class MainArmstrongNumber {
	public static void main(String[] args) {
		ArmstrongNumber number=new ArmstrongNumber();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check Armstrong:");
		int variable=sc.nextInt();
		number.setNumber(variable);
		if(number.isArmstrongNo()) 
			System.out.println(variable+" is a Armstrong Number");
		else
			System.out.println(variable+" is not a Armstrong Number");
		
		sc.close();
		
//		System.out.println("Enter int value:");
//		int variable=sc.nextInt();	
//		System.out.println("Enter string value:");
//		sc.nextLine(); //scanner catch
//		String address=sc.nextLine();
		
	}

}
