package in.java8features.testingfunctionalinterface.entities;

import java.util.function.Supplier;

public class SupplierObjects {
	public static final Supplier<Integer> randomInt=()->(int)(Math.random()*100);
	

}
