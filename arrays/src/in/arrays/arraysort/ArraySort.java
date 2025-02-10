package in.arrays.arraysort;

import java.util.Scanner;

public class ArraySort {
	
	public void sortArray(int size,int[] arr)
	{
		for(int i=0;i<size;i++)
		{
			int temp;
			for(int j=i+1;j<size;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		ArraySort obj=new ArraySort();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		obj.sortArray(size, arr);
		
		
		
	}

}
