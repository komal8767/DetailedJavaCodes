package in.java8features.testingfunctionalinterface;

import java.util.function.Function;

import in.java8features.testingfunctionalinterface.entities.Fan;

public class TestFunctionInterface {
	public static void main(String[] args) {
		Function<String, Integer> funObj=
//				(String name)->{
//			return name.length();
				name->name.length();
//		};
		System.out.println(funObj.apply("komal"));
		
		
		Function<Integer, Float> bill=units->(units*7.48F);
		System.out.println(bill.apply(200));
		
	    Fan fan=new Fan("Lavender",2);
		Function<Fan, String> colorSupply=color->color.getColor();
		System.out.println(colorSupply.apply(fan));
		

	}

}
