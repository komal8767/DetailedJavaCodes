package in.arrays.sorting;

public class SelectionSort {
	String[] stringArr;

	public String[] getStringArr() {
		return stringArr;
	}

	public void setStringArr(String[] stringArr) {
		this.stringArr = stringArr;
	}

	public SelectionSort(String[] stringArr) {
		this.stringArr = stringArr;
	}

	public SelectionSort() {}
	public void selectionSort() {
		int key;
		String temp;
		for(int i=0;i<stringArr.length;i++) 
		{
			key=i;
			for(int j=i+1;j<stringArr.length;j++) 
			{
				if(stringArr[key].compareTo(stringArr[j])>0)
					key=j;
			}
			temp=stringArr[i];
			stringArr[i]=stringArr[key];
			stringArr[key]=temp;
			
			
			for(String name:stringArr)
				System.out.print(name+" ");
			
			System.out.println();
		}
		System.out.println();
		
	}
	

}
