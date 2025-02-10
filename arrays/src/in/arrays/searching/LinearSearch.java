package in.arrays.searching;

public class LinearSearch {
	int arr[];
	int key;
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int linearSearch() {
		for(int i=0;i<arr.length;i++) 
			if(key==arr[i])
				return i;
			
		return -1;	

	}

}
