package in.java.staticandfinal.finaldemo;

public class MainHolidays {
	public static void main(String[] args) {
		Holidays diwali=new Holidays("Diwali",15);
		System.out.println(diwali); 
		//object class involve toString method which prints memory address to avoid this override toString method
		Holidays dusshera=new Holidays("Dusshera",10);
		System.out.println(dusshera.toString()); 
		System.out.println("festival Name:"+diwali.getFestivalName());
		//System.out.println("No of leaves:"+diwali.getNoOfLeaves());
	}

}
