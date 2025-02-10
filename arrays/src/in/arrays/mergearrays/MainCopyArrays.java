package in.arrays.mergearrays;

import java.util.Arrays;

public class MainCopyArrays {
	public static void main(String[] args) {
		int[] first= {5,6,8,23,21};
//		int[] first= {3,5,6,7,2,3,3};
		int len=first.length;
		System.out.println("First Array half:"+(len+1)/2);
		int[] second= {65,9,27,2};
		CopyArrays obj=new CopyArrays();
		obj.setFirstArr(first);
		obj.setSecondArr(second);
		int[] result=obj.copyTwoArrays();
		System.out.println(Arrays.toString(result));
		
		
		
//		for(int n:result)
//			System.out.print(n+" ");
		System.out.println("Half Arrays merging:");
		int[] output=obj.copyHalfArrays(first,second);
		System.out.println(Arrays.toString(output));
		
		
		System.out.println("Sorted half Arrays:");
		int[] arr=obj.sortHalfArrays();
		for(int p:arr)
			System.out.print(p+" ");
		
		System.out.println();
		System.out.println("sorted two arrays:");
		int[] arr1=obj.sortCopiedArrays();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		
	}

}
