package in.java8features.testingfunctionalinterface;

import java.util.function.Consumer;

import in.java8features.testingfunctionalinterface.entities.ConsumerObjects;
import in.java8features.testingfunctionalinterface.entities.Fan;

public class TestConsumerInterface {
	public static void main(String[] args) {

		ConsumerObjects.consumer.accept("komal");
		ConsumerObjects.consumer.accept("sakshi");
		ConsumerObjects.consumer.accept("payal");
		ConsumerObjects.consumer.accept("nikita");
		
		System.out.println("\nAnother wrapper class");
		ConsumerObjects.obj.accept(21);
		
		System.out.println("\nFan class");
		Fan fan1=new Fan("Black",3);
		ConsumerObjects.fanObj.accept(fan1);
	}

}
