package in.java.javasymboisis.numberseries;

public class AlphabetSeries {
	int limit;
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public void printSeries() {
		//int a=65;
		//int b=69;
		for(int i=65;i<=65+limit;i++) {
			if(i%2!=0) {
				System.out.print((char)i+" ");
					
			}
			else {
				System.out.print((char)(i+3)+" ");
			
			}
		}
	}

}
