package in.java.javasymboisis.numberoperation;

public class MainReverseNumber {
	public static void main(String[] args) {
		//ReverseNum object=new ReverseNum();
		//object.printReverse();
		ReverseNum obj=new ReverseNum(45654L);
		obj.printReverse();
		obj.setNum(87346L);
		System.out.println("Number is:"+obj.getNum());
		obj.printReverse();
	}

}

