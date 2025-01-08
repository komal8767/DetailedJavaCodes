package in.java.javasymboisis.vowelinstring;

import java.util.Scanner;

public class MainVowelStringCount {
	public static void main(String[] args) {
		VowelStringCount obj=new VowelStringCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String line to check vowel count:");
		String strVar=sc.next();
		obj.setVar(strVar);
		obj.countingVowel();
	}
	

}
