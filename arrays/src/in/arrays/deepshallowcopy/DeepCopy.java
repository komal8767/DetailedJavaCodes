package in.arrays.deepshallowcopy;

import java.util.Arrays;

public class DeepCopy {
	public void copyEachElement(int[] srcArr) {
		int[] destArr=new int[srcArr.length];
		for(int i=0;i<srcArr.length;i++) {
			destArr[i]=srcArr[i];
		}
		System.out.println("Source Array:");
		for(int number:srcArr)
			System.out.print(number+" ");
		System.out.println();
		System.out.println("Destination Array:");
		System.out.println(Arrays.toString(destArr));
		destArr[0]=25;
		System.out.println();
		System.out.println("After change:Destination Array:");
		System.out.println(Arrays.toString(destArr)); //java.util part
		System.out.println("After change:Source Array:");
		System.out.println(Arrays.toString(srcArr)); //change not reflects in source array
	
	}
	

}
