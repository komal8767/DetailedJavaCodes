package in.java.tableofnumber;

import java.util.Scanner;

public class MainTableOfNumber {
	public static void main(String[] args) {
		TableOfNumber obj=new TableOfNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to print table:");
		int no=sc.nextInt();
		System.out.println("Enter limit:");
		int limit=sc.nextInt();
		obj.printTable(no, limit);
	}

}
