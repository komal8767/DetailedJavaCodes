package in.arrays.sorting;

public class MainInsertionSort {
public static void main(String[] args) {
	InsertionSort sort=new InsertionSort();
	String[] names= {"komal","yamini","arha","jerry","sayali"};
	sort.setNames(names);
	System.out.println("Before Sorting:");
	for(String name:names)
		System.out.print(name+" ");
	System.out.println();
	sort.insertionSort();
	System.out.println();
	System.out.println("After Sorting:");
	for(String name:names)
		System.out.print(name+" ");
}

}
