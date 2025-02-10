package in.java.primecheck;

public class MainPrimeNumber {
	public static void main(String[] args) {
		PrimeNumber obj=new PrimeNumber();
		if(obj.isPrime(11,2))
			System.out.println("no is prime");
		else
			System.out.println("no is not prime");
	}

}
