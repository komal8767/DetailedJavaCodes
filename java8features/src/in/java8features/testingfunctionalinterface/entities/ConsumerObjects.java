package in.java8features.testingfunctionalinterface.entities;

import java.util.function.Consumer;

public class ConsumerObjects {
//	Consumer<String> consumer=new Consumer<String>() {
//		public void accept(String name) {
//			System.out.println("name is:"+name);
//		}
//		
//	};
//	public final static Consumer<String> consumer=name->System.out.println(name);
	public final static Consumer<String> consumer=System.out::println;
	public final static Consumer<Integer> obj=age->System.out.println(age);
	public final static Consumer<Fan> fanObj=fan->System.out.println(fan); //.toString()

}
