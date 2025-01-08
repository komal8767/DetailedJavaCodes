package in.java.javasymboisis.armstrongnumber;

public class ArmstrongNumber {
	int number;
	public ArmstrongNumber() {}
	public ArmstrongNumber(int number)
	{
		this.number=number;
	}
	public void setNumber(int number) {
		this.number=number;
	}
	public int getNumber() {
		return number;
	}
	public int calculateNoOfDigit() {
		int temp=number;
		int count=0;
		while(temp>0) {
			temp=temp/10;    //temp/=10;
			count++;
		}
		return count;
	}
	public int calculatePower(int digit,int count) {
		int power=1;
		for(int i=1;i<=count;i++) {
			power*=digit;		
		}
		return power;
	}
	public boolean isArmstrongNo() {
		int count=calculateNoOfDigit();
		int temp=number;
		int armstrong=0;
		while(temp>0) {
			armstrong=armstrong+calculatePower(temp%10,count);
			temp/=10;
		}
		return number==armstrong;
	}
}
