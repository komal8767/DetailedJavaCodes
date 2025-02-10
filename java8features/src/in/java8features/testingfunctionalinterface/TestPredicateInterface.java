package in.java8features.testingfunctionalinterface;

import java.util.function.Predicate;

import in.java8features.testingfunctionalinterface.entities.Fan;
import in.java8features.testingfunctionalinterface.entities.PredicateObjects;

public class TestPredicateInterface {
	
	public static void main(String[] args) {
		Fan fan=new Fan("Pink",3);
		boolean result=PredicateObjects.fanValidate.test(fan);
     if(result)
     	System.out.println(fan);
     else
     	System.out.println("Invalid input");
	     
	
	}
	
}
