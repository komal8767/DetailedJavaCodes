package in.java.javasymboisis.perfectnumber;

public class PerfectNumber {
	int number;
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public boolean isPerfectNo() {    //(int number)
		if(number<=1)
			return false;
		int sum=0;
		for(int i=1;i<=number/2;i++) {
			if(number%i==0) 
				sum=sum+i;	
		}
		return number==sum;
	}


}
