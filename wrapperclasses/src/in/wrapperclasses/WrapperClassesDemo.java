package in.wrapperclasses;

import java.util.Comparator;

public class WrapperClassesDemo {
	
	public static void main(String[] args) {
		Integer var01=new Integer(10); //depricate from SE version 9- vanish in next few years
		System.out.println(var01);
		//Auto-boxing
		Integer var2=Integer.valueOf(20); 
		
		//Auto-unboxing
		int var3=var2.intValue();
		System.out.println(var2);
		int var4=var01;
		int var5=var4;
		System.out.println(var5);
		
		System.out.println(Integer.MAX_VALUE);//min_value
		int parseResult=Integer.parseInt("123");
		System.out.println(parseResult);
		
		//parseXxx(Static method) //convert string into any data type
		float r=Float.parseFloat("12.50");
		System.out.println(r);
		
		//xxxvalue
		
		int intValueResult=var01.intValue();
		float fValue=var01.floatValue();
		System.out.println(intValueResult);
		System.out.println(fValue);
		
		//toString()
		Float floatVar=10.20F;
		String floatToString=floatVar.toString();
		
		Byte byteVar=10;
		System.out.println(Integer.toBinaryString(byteVar));
		
		
		//isChar isN
		Character ch='a';
		boolean isAlphabet=Character.isAlphabetic(ch);
		boolean isLetter=Character.isLetter(ch);
		boolean isDigit=Character.isDigit(ch);
		System.out.println(isAlphabet);
		System.out.println(isDigit);
		System.out.println(isLetter);
		
		Character upCase=Character.toUpperCase(ch);  //create new object
		System.out.println(upCase);
		
		Boolean isTrue=true;
		System.out.println(Boolean.parseBoolean("True"));
		Boolean isFalse=false;
		
		
		Integer intVar1=200;//intVar1=object
		Integer intVar2=200;
		System.out.println(intVar1==intVar2);
		
		System.out.println();
		Float floatVar1=10.5F;//create new object
		Float floatVar2=10.21F;
		System.out.println(floatVar1==floatVar2);
		
		System.out.println(floatVar1.equals(floatVar2));
		
		//comparable inteface-(functional) having methos compareTo()
		int no=floatVar1.compareTo(floatVar2);
		System.out.println(no);
		
		System.out.println("compare method");
	   //comparator inteface-compare method-static method
		int compResult=Float.compare(floatVar1, floatVar2);
		System.out.println(compResult);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
