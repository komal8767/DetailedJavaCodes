package in.arrays.sorting;

public class MainSelectionSort {
	public static void main(String[] args) {
		SelectionSort obj=new SelectionSort();
		String[] names= {"N","a","K","z","L"};
		obj.setStringArr(names);
		System.out.println("Before Sorting:");
		for(int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println();
		obj.selectionSort();
		System.out.println();
		System.out.println("After Sorting:");
		for(String name:names)
			System.out.print(name+" ");
	}

}
