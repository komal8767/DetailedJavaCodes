package in.java.javasymboisis.pattern;
//import java.util.Scanner;

public class TriangularPattern {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number of rows you want to print:");
//		int row=sc.nextInt();
//		int i,j,k;
//		int number=1;
//		for(i=1;i<=row;i++) {
//			for(j=row-1;j>=i;j--) {
//				System.out.print(" ");
//			}
//			for(k=1;k<=i;k++) {
//				System.out.print(number+" ");
//				number++;
//			}
//			System.out.println();
//		}
//		
//	}
	
	public static void main(String[] args) {
		Pyramid obj=new Pyramid(4);
		obj.printPyramid();
		obj.printcomplex();
		obj.printNext();
		obj.setLimit(6);
		System.out.println("New limit:"+obj.getLimit());
		obj.printPyramid();
		
		
		
		
	}
	

}
class Pyramid{
	int limit;
	public Pyramid(int limit) {
	  this.limit=limit;
	}
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public void printPyramid() {
		int number=1;
		int ch=65;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=limit-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
//				1-System.out.print(number+" ");
//				1-number++;
				System.out.print((i%2==0)?((char)ch+++" "):(number+++" "));
//				2-if(i%2!=0)
//				   2-System.out.print(number++ + " ");
//				2-else
//					2-System.out.print(ch++ + " ");
			}
		System.out.println();
		}
	}
	
	
	public void printcomplex() {
		char ch1='A';
		int number1=1;
		for(int i=1;i<=limit;i++) {
			for(int j=1;j<=limit-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				if(i%2==0) 
				{
				   if(k%2!=0)
					   System.out.print(ch1++ + " ");
				   else
					   System.out.print(number1++ + " ");
				}
				else
				{
					if(k%2!=0)
						System.out.print(number1++ + " ");
					else 
						System.out.print(ch1++ +" ");
				
				}
//				System.out.print((i%2==0)?(k%2!=0)?ch1++ + " ":number1++ + " ":(k%2!=0)?number1++ + " ":ch1++ + " ");
			}
			System.out.println();
		}
	}
		
		
		public void printNext() {
			char ch1='A';
			int number1=1;
			for(int i=1;i<=limit;i++) {
				for(int j=1;j<=limit-i;j++) {
					System.out.print("  ");
				}
				for(int k=1;k<=(i*2)-1;k++) {
					
					if(i%2==0) 
					{
					   if(k%2!=0)
						   System.out.print(ch1++ + " ");
					   else
						   System.out.print(number1++ + " ");
					}
					else
					{
						if(k%2!=0)
							System.out.print(number1++ + " ");
						else 
							System.out.print(ch1++ +" ");
					
					}
				}
				System.out.println();
		}
	}
}
