package in.arrays.sorting;

import java.util.Arrays;

public class MainMergeSort {
	public static void main(String[] args) {
		MergeSort obj=new MergeSort();
		int[] array= {8,62,5,9,1,6};
		obj.setIntArr(array);
		obj.sort(0, array.length-1);
		System.out.println(Arrays.toString(array));
	}

}
