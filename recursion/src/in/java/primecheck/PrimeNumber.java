package in.java.primecheck;

public class PrimeNumber {
	public boolean isPrime(int no, int fact) {
		if(no<2)
			return false;
		if(fact*fact>no)
			return true;
		if(no%fact==0)
			return false;
		else
			return isPrime(no,fact+1);
		
	}

}
