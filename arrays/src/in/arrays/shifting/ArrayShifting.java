package in.arrays.shifting;

public class ArrayShifting {
	public void leftShift(int[] intArray) {//both pointing same memory location or reference
		int temp=intArray[0];
		for(int i=0;i<intArray.length-1;i++) {
			intArray[i]=intArray[i+1];
		}
		intArray[intArray.length-1]=temp;
		
		
	}
	
	public void rightShift(int[] arr) {
		int temp=arr[arr.length-1];
		for(int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
		
	}

}
