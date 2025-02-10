package in.arrays.searching;

import java.util.Arrays;

public class MainBinarySearch {
	public static void main(String[] args) {
		BinarySearch obj=new BinarySearch();
		int arr[]= {1,2,3,4,5,4,76,6};
//		System.out.println(arr.length);
//		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		int key=2;
		obj.setArr(arr);
		obj.setKey(key);
		if(obj.search()>0)
			System.out.println("element found at index:"+obj.search());
		else
			System.out.println("element not found");
		
	}

}
