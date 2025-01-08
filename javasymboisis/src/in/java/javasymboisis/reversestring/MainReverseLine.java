package in.java.javasymboisis.reversestring;

import java.util.Scanner;

public class MainReverseLine {
	public static void main(String[] args) {
		ReverseLine object=new ReverseLine();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String line to reverse:");
		String strVar=sc.nextLine();
		object.setVariable(strVar);
		String result=object.reverseStringLine();
		System.out.println(result);
		sc.close();

}
}
