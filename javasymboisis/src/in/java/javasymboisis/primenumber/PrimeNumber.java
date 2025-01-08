package in.java.javasymboisis.primenumber;

public class PrimeNumber {
	int number;
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public boolean isPrimeNumber() {
		for(int i=2;i*i<number;i++) {    //i<Math.sqrt(number)
			if(number%i==0) {
				return false;
				
			}
		}
	   return true;
		
	}
	
}


