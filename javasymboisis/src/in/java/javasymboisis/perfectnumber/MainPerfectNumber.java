package in.java.javasymboisis.perfectnumber;
import java.util.Scanner;
public class MainPerfectNumber {
	public static void main(String[] args) {
		PerfectNumber obj=new PerfectNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check Perfect:");
		int num=sc.nextInt();
//		if(obj.isPerfectNo(num)) 
//			System.out.println(num+" is perfect number");
//		else
//			System.out.println(num+" is not perfect number");
		
		obj.setNumber(num);
		if(obj.isPerfectNo())
			System.out.println(num+" is perfect No");
		else
			System.out.println(num+" is not a perfect No");
		sc.close();
		
	}

}
