package in.arrays.varargsarraysclass;

import java.util.Arrays;

public class ArraysClassDemo {
	public static void main(String[] args) {
		int[] arr=new int[5];
		System.out.println(Arrays.toString(arr));
		Arrays.fill(arr,1,4,3);
		print(arr);
		print1(6,"komal",1,2,3,4,5,6);
	}
	
	public static void print(int... arr)
	{
		System.out.println(Arrays.toString(arr));
		
	}
	public static void print1(int length, String name, int... arr)
	{
		System.out.println(Arrays.toString(arr));
		
	}

}
