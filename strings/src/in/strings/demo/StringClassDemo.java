package in.strings.demo;

import java.util.Arrays;
//immutable
//not synchronised
//buffer capacity-not applicable
//accessing-faster
//modification-slow
public class StringClassDemo {
	public static void main(String[] args) {
		String name="ABCA";
		String name1=new String();
		String name2=new String("abc");
		char[] ch= {'a','b','c'};
		String name3=new String(ch);
		int len=name.length();
		char c=name.charAt(0);
		System.out.println(len);
		System.out.println(c);
		name=name.replace('A','z');
		System.out.println(name);
		
		System.out.println(name1);
		String newResult=name.replace("zB", "A");
		System.out.println(newResult);
		
		String finalResult=newResult.concat(name);
		System.out.println(finalResult);
		
		System.out.println(finalResult.contains("zBs"));  //gives boolean result
		
		String subString=finalResult.substring(2);
		System.out.println(subString);
		
		String subString1=finalResult.substring(0,4);
		System.out.println(subString1);
		
		String[] splitResult=finalResult.split("zz");
		System.out.println(Arrays.toString(splitResult));
		
		String joinResult=String.join(":", splitResult);
		System.out.println(joinResult);
		
		boolean matchResult=joinResult.matches(":");
		System.out.println(matchResult);
		
		char[] charArr=joinResult.toCharArray();
		System.out.println(Arrays.toString(charArr));
		
		//intern()-- gives reference of constant pool to str1
		String str1=new String("ABC").intern();//create object in heap and constant pool both
		String str2="ABC";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		
		
		
	
	}

}
