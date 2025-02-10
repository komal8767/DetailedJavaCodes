package in.java8features.testingfunctionalinterface.entities;

import java.util.function.BiConsumer;

public class BiConsumerObjects {
	public static final BiConsumer<String, Integer> nameAndAge=(name,age)->
    System.out.println("name:"+name +" Age:"+age);
    
    public static final BiConsumer<String, Integer> validVoter=(name,age)->
    System.out.println(age>18?"valid voter":"Invalid voter");
    
    public static final BiConsumer<String, Integer> votingList=nameAndAge.andThen(validVoter);

}
