package in.java.javasymboisis.numberseries;

public class Alternate {
	int limit;
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public void printSeries() {
		int p=5;
		int q=1;
		for(int i=1;i<=limit;i++) {
			if(i%2==0) {
				System.out.print(p+" ");
				p+=2;
			}
			else {
				System.out.print(q+" ");
				q+=2;
			}
			
		}
	}

}
