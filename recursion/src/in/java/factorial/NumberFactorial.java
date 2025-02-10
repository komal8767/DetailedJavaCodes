package in.java.factorial;

public class NumberFactorial {
	public int printFactorial(int no) {  //3
//		if(no<1)
//			return 1;
//		else
//			return no * printFactorial(no-1);
		return (no<=0) ? 1 :no*printFactorial(no-1);
	}

}
