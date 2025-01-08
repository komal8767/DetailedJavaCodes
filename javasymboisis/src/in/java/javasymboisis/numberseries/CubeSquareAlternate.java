package in.java.javasymboisis.numberseries;

public class CubeSquareAlternate {
	int limit;
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	public void printSeries() {
		for(int i=1;i<=limit;i++) {
			if(i%2==0)
				System.out.print(i*i+" ");
			else
				System.out.print(i*i*i+" ");
		}
	}

}
