package in.java8features.testingfunctionalinterface;

import java.util.function.BiConsumer;

import static in.java8features.testingfunctionalinterface.entities.BiConsumerObjects.*;

public class TestBiConsumer {
	public static void main(String[] args) {
//		BiConsumer<String, Integer> nameAndAge=new BiConsumer<String, Integer>()
//				{
//			public void accept(String name, Integer age) {
//				System.out.println("name:"+name +" Age:"+age);
//				
//			}
//			
//			};
//		BiConsumer<String, Integer> nameAndAge=(name,age)->
//		             System.out.println("name:"+name +" Age:"+age);
////		BiConsumer<String, Integer> validVoter=new BiConsumer<>() {
////			public void accept(String name, Integer age) {
////				System.out.println(age>18?"valid voter":"Invalid voter");
////			}
////			
////		};
//	    BiConsumer<String, Integer> validVoter=(name,age)->
//	           System.out.println(age>18?"valid voter":"Invalid voter");
//		nameAndAge.accept("komal",21);
//		validVoter.accept("payal", 17);
//		BiConsumer<String, Integer> votingList=nameAndAge.andThen(validVoter);
//		votingList.accept("abc", 26);
		
		
		
		nameAndAge.accept("Komal", 21);
		validVoter.accept("namu", 11);
		votingList.accept("abc", 28);
		
		
		
		
		
		
	}

}
