package in.arrays.searching;

public class MainLinearSearch {
	public static void main(String[] args) {
		LinearSearch obj=new LinearSearch();
		int[] arr= {6,9,26,4,32};
		obj.setArr(arr);
		obj.setKey(4);
		if(obj.linearSearch()>=0) { 
			System.out.println("Given key found at:"+obj.linearSearch());
		}
		
		else
			System.out.println("Element not found");
			
		
	}

}
