package in.arrays.varargsarraysclass;

import java.util.Arrays;

public class Arrays2D {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		int[][] arr1= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.deepToString(arr1));
		
		int[][] array=new int[3][];
		array[0]= new int[] {1,2,8};
		array[1]= new int[] {4,2,4};
		array[2]= new int[] {4,2,4,8,6};
		System.out.println(Arrays.deepToString(array));
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for(int rows[]:array) {
			for(int col:rows) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}

}
