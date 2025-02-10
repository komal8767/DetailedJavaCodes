package in.arrays.sorting;

public class IntInsertionSort {
	int[] intArr;

	public int[] getIntArr() {
		return intArr;
	}

	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
	}
	public void sort() {
		int key;
		int j;
		for(int i=0;i<intArr.length;i++) {
			key=intArr[i];
			j=i-1;
			while(j>=0 && intArr[j]>key) {
				intArr[j+1]=intArr[j];
				j--;
			}
			intArr[j+1]=key;
		}
	}

}
