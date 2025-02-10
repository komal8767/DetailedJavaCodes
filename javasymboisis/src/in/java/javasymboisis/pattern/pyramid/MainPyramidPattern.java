package in.java.javasymboisis.pattern.pyramid;
import java.util.Scanner;
public class MainPyramidPattern {
	public static void main(String[] args) {
		PyramidPattern obj=new PyramidPattern();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int rows=sc.nextInt();
		obj.setNum(rows);
		obj.printPyramid();
		sc.close();
	}

}



