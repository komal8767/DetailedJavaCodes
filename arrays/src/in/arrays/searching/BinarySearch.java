package in.arrays.searching;

import java.util.Arrays;

public class BinarySearch {
	int[] arr;
	int key;

	public BinarySearch(int[] arr) {
		
		this.arr = arr;
	}

	public BinarySearch() {}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}
	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int search() {
		Arrays.sort(arr);
		int left=0;
		int right=arr.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				left=mid+1;
			else
				right=mid;  //mid-1
			
		}
		return -1;
		
		
	}

	

}
