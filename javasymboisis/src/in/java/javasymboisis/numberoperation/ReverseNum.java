package in.java.javasymboisis.numberoperation;

public class ReverseNum {
	long number;
	public ReverseNum() {
		
	}
	public ReverseNum(long number)
	{
		this.number=number;
	}
	public void setNum(long number) {
		this.number=number;
	}
	public long getNum() {
		return number;
	}
	public void printReverse() {
		long i;
		long x=number;
		long rev=0;
		while(number>0)  //(number!=0)
		{
			i=number%10;
			rev=rev*10+i;
			number=number/10;	
		}
		System.out.println("Reverse of "+ x +" is "+rev);
		if(x==rev)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
		
	}
	

}
