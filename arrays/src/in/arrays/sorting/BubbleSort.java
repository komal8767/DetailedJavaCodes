package in.arrays.sorting;

public class BubbleSort {
	String[] stringArr;

	public String[] getStringArr() {
		return stringArr;
	}

	public void setStringArr(String[] stringArr) {
		this.stringArr = stringArr;
	}

	public BubbleSort(String[] stringArr) {
		this.stringArr = stringArr;
	}

	public BubbleSort() {}
	
	public void bubbleSort() {
		boolean isNotSwapped=false;
		for(int i=0;i<stringArr.length-1;i++) { //no of iteration
			for(int j=0;j<stringArr.length-i-1;j++) {   //n2 to n(log n)
				if(stringArr[j].compareTo(stringArr[j+1])>0) {
					String temp=stringArr[j];
					stringArr[j]=stringArr[j+1];
					stringArr[j+1]=temp;
					isNotSwapped=true;
					
				}
				
				for(String name:stringArr)
					System.out.print(name+" ");
				
				System.out.println();
			}
			System.out.println();
			if(!isNotSwapped) {
				break;
			}
			
		}
	}
	

}
