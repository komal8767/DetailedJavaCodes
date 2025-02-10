package in.arrays.sorting;

public class MainBubbleSort {
	public static void main(String[] args) {
		BubbleSort sort=new BubbleSort();
		String[] names= {"N","a","K","A","L"};
		sort.setStringArr(names);
		System.out.println("Before Sorting:");
		for(String name:names)
			System.out.print(name+" ");
		System.out.println();
		sort.bubbleSort();
		System.out.println();
		System.out.println("After Sorting:");
		for(String name:names)
			System.out.print(name+" ");
	}

}
