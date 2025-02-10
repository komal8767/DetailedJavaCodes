package in.java.powerofnumber;

public class PowerOfNumber {
	public int printPower(int base, int power) {//3,2
//		if(power<=1)
//			return base;
//		else
//			return base*printPower(base,power-1);
		return (power<=0) ? 1 :base*printPower(base,power-1);
	}

}
