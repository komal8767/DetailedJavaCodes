package in.arrays.mergearrays;

import java.util.Arrays;

public class CopyArrays {
	int[] firstArr;
	int[] secondArr;
	
	public int[] getFirstArr() {
		return firstArr;
	}

	public void setFirstArr(int[] firstArr) {
		this.firstArr = firstArr;
	}

	public int[] getSecondArr() {
		return secondArr;
	}

	public void setSecondArr(int[] secondArr) {
		this.secondArr = secondArr;
	}

	public int[] copyTwoArrays()
	{
		int[] resultArr=new int[firstArr.length+secondArr.length];
		int r=0;
		for(int f=0;f<firstArr.length;f++) {
			resultArr[r]=firstArr[f];
			r++;
		}
		for(int s=0;s<secondArr.length;s++) {
			resultArr[r++]=secondArr[s];
		}
		return resultArr;
	}
	
	public int[] copyHalfArrays(int[] firstArr, int[] secondArr) {
		int firstMid=(firstArr.length-1)/2;
		int secondMid=(secondArr.length-1)/2;
		int[] result=new int[firstMid+1 + secondMid+1];
		if(secondArr.length%2==0)
			secondMid++;
		int r=0;
		for(int f=0;f<=firstMid;f++)
			result[r++]=firstArr[f];
		
		for(int s=secondMid;s<secondArr.length;s++)
			result[r++]=secondArr[s];
		
		return result;
	}
	
	
	public int[] sortHalfArrays() {
		int mid1=(firstArr.length-1)/2;
		int mid2=(secondArr.length-1)/2;
		int []resultArr=new int[mid1+1+mid2+1];
		if(secondArr.length%2==0)
			mid2++;
		int f=0,s=mid2,r=0;
		while(f<=mid1 && s<secondArr.length) {
			if(firstArr[f]<secondArr[s])  
				resultArr[r]=firstArr[f++];
			else 
				resultArr[r]=secondArr[s++];
			r++;
		}
		while(f<=mid1)
			resultArr[r++]=firstArr[f++];
		while(s<secondArr.length)
			resultArr[r++]=secondArr[s++];
		return resultArr;
		
	}
	public int[] sortCopiedArrays()
	{
		int[] resultArr=new int[firstArr.length+secondArr.length];
		int r=0,f=0,s=0;
		Arrays.sort(firstArr);
		Arrays.sort(secondArr);
		while(f<firstArr.length && s<firstArr.length) {
			if(firstArr[f]<secondArr[s])  
				resultArr[r]=firstArr[f++];
			else 
				resultArr[r]=secondArr[s++];
			r++;
			
		}
		while(f<firstArr.length)
			resultArr[r++]=firstArr[f++];
		while(s<secondArr.length)
			resultArr[r++]=secondArr[s++];	
		
		return resultArr;
	}
	

}
