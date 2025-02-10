package in.arrays.sorting;

public class MainIntInsertion {
	public static void main(String[] args) {
		IntInsertionSort sort=new IntInsertionSort();
		int[] intArr= {5,2,7,28,3,1};
		sort.setIntArr(intArr);
		System.out.println("Before Sorting:");
		for(int name:intArr)
			System.out.print(name+" ");
		System.out.println();
		sort.sort();
		System.out.println();
		System.out.println("After Sorting:");
		for(int name:intArr)
			System.out.print(name+" ");
	}

}
