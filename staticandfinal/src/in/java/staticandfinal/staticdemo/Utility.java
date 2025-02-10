package in.java.staticandfinal.staticdemo;

public class Utility {
	public static double addition(int no1, int no2) {
		return no1+no2;
	}
	
	public static double power(double base, double exponent) {
		double power=1;
		for(int i=1;i<=exponent;i++)
			power=power*base;
		return power;
	}
	
	public static double areaOfRect(double length, double width) {
		return length*width;
	}
}
