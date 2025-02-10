package in.java.calculatecum;

public class SumCalculation {
	int no;
	
	public int calculateSum(int no) {
		if(no<0)
			return 1;
		
		return no + calculateSum(no-1); 
		
	}

}
