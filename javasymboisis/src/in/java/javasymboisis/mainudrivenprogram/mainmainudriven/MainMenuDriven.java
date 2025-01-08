package in.java.javasymboisis.mainudrivenprogram.mainmainudriven;

import java.util.Scanner;

import in.java.javasymboisis.mainudrivenprogram.presentationlayer.Helper;

public class MainMenuDriven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Helper helper=new Helper();
		int option;
		do {
			option=helper.printMenu(sc);
			System.out.println(option);
			switch(option) {
			case 1:
				helper.checkPalindrome(sc);
			    break;
			case 2:
				helper.checkArmstrongNo(sc);
				break;
			case 3:
				helper.checkPerfect(sc);
				break;
			case 4:
				helper.checkPrime(sc);
				break;
			case 0:
				System.out.println("bye....");
				break;
			default:
				System.out.println("Invalid Input...");
					
			}
		}while(option!=0);
		sc.close();
	}

}
