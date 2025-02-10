package in.java.fibonacciseries;

public class FibonacciSeries1 {
	public int printSeries1(int no) {
		if(no<=1)
			return no;
		return printSeries1(no-1)+ printSeries1(no-2);
	}

}
