package in.java.javasymboisis.reversestring;

import java.util.Scanner;

public class MainReverseString {
	public static void main(String[] args) {
		ReverseString object=new ReverseString();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to reverse:");
		String strVar=sc.next();
		object.setVariable(strVar);
		String result=object.reverseString();
		System.out.println(result);
		sc.close();
		
//		object.setVariable("komal");
//		String result=object.reverseString();
//		System.out.println(result);
}

}
