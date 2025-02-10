package in.java8features.testingfunctionalinterface;

import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import in.java8features.testingfunctionalinterface.entities.Fan;

public class MethodReferencingConsumerAndSupplier {
	public static void main(String[] args) {
		Fan fan1=new Fan();
	//	Consumer<String> fanColorConsumer=color->fan1.setColor(color);
		//Method referencing
		Consumer<String> fanColorConsumer=fan1::setColor;
		fanColorConsumer.accept("violet");
		//Supplier<String> fanColorSupplier=()->fan1.getColor();
		Supplier<String> fanColorSupplier=fan1::getColor;
		String fanColor=fanColorSupplier.get();
		System.out.println(fanColor);
		
		Consumer<Integer> fanSpeedConsumer=fan1::setSpeed;
		fanSpeedConsumer.accept(4);
		Supplier<Integer> fanSpeedSupplier=fan1::getSpeed;
		System.out.println(fanSpeedSupplier.get());
		
		DoubleSupplier randomSupplier=()->(Math.random()*100);
		System.out.println(randomSupplier.getAsDouble());
	}

}


