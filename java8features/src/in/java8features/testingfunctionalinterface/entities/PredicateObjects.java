package in.java8features.testingfunctionalinterface.entities;

import java.util.function.Predicate;

public class PredicateObjects {
	public static final Predicate<Fan> fanValidate=fan->fan.getColor().matches("[A-Z][a-z]+") 
			&& fan.getColor().length()>=3 && fan.getSpeed()>0;

}
