package in.arrays.minmaxno;
import java.util.Scanner;
public class MainMaxMinNo {
	public static void main(String[] args) {
		MaxNumber max=new MaxNumber();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		System.out.println("Enter array elements:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Largest Number is:"+max.printMaxNo(arr));
		
	}

}
