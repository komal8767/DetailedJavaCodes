package in.arrays.minmaxno;

public class MaxNumber {
	public int printMaxNo(int[] arr) {
		int temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(temp<arr[i]) {
				temp=arr[i];
			}
		}
		return temp;
	}

}
