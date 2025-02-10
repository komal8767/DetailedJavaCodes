package in.arrays.sorting;

import java.util.Arrays;

public class MergeSort {
	int[] intArr;

	public int[] getIntArr() {
		return intArr;
	}

	public void setIntArr(int[] intArr) {
		this.intArr = intArr;
	}

	public MergeSort(int[] intArr) {
		this.intArr = intArr;
	}

	public MergeSort() {}
	
	public void sort(int left, int right) {
		if(left<right) {
			int mid=(left+right)/2;
			sort(left,mid);
			sort(mid+1,right);
			//merge(left,mid,right);
			merge1(left,mid,right);
			
		}
	}

	private void merge(int left, int mid, int right) 
	{
		int firstArrSize=mid-left+1;
		int secondArrSize=right-mid;
		int firstArr[]=new int[firstArrSize];
		int secondArr[]=new int[secondArrSize];
		for(int i=0;i<firstArrSize;i++)
			firstArr[i]=intArr[left+i];
		for(int j=0;j<secondArrSize;j++)
			secondArr[j]=intArr[mid+1+j];
		
		int f=0,s=0;
		int r=left;
		while(f<firstArrSize && s<secondArrSize) {
			if(firstArr[f]<secondArr[s]) 
				intArr[r++]=firstArr[f++];
			else
				intArr[r++]=secondArr[s++];
		}
		while(f<firstArrSize)
			intArr[r++]=firstArr[f++];
		while(s<secondArrSize)
			intArr[r++]=secondArr[s++];	
	}
	
	
	private void merge1(int left, int mid, int right) {
//		int[] tempArr=new int[intArr.length];
//		for(int i=0;i<intArr.length;i++)
//			tempArr[i]=intArr[i];
		
		int[] tempArr=Arrays.copyOf(intArr, right+1);
		int f=left;
		int s=mid+1;
		int r=left;
		while(f<=mid && s<=right) {
			if(tempArr[f]<tempArr[s]) {
				intArr[r++]=tempArr[f++];
			}
			else {
				intArr[r++]=tempArr[s++];
			}
		}
		while(f<=mid) {
			intArr[r]=tempArr[f++];
			r++;
		}
		while(s<=right)
			intArr[r++]=tempArr[s++];
		
		
	}
		
	
	

}
