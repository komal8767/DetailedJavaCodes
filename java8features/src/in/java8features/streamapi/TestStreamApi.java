package in.java8features.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.*;

public class TestStreamApi {
	public static void main(String[] args) {
		int[] intArr= {1,2,3,4,5,6,7,8,9,10};
	//	IntStream intStream=Arrays.stream(intArr);
		Stream<Integer> intStream=Stream.of(1,2,3,4,5,6,7,8,9,10);
		intStream.filter(no->no%2==0)
		        .forEach(System.out::println);
		
		
		System.out.println();
		String[] strArr= {"komal", "sakshi","joke","jenny","Jenifery"};
		Stream<String> strStream=Arrays.stream(strArr);
		strStream.filter(name->name.toLowerCase().charAt(0)=='j').
		map(name->name.length()).
		filter(name1->name1%2==0).
		forEach(name->System.out.println(name));
//		strStream.map(name->name.length()).forEach(length->System.out.println(length));
//		strStream.filter(name->name.length()%2==0).forEach(System.out::println);
		
		
		
		
		
		
		System.out.println();
		Stream<String> nameStream=Stream.of("joker","jamuna","jel","komal","om","jel");
	//	nameStream.map(name->name.length()).forEach(System.out::println);
	//	nameStream.map(name->name.length()).forEach(length->System.out.println(length));
		nameStream.filter(name->name.toLowerCase().charAt(0)=='j').sorted().limit(2).skip(1).distinct().forEach(System.out::println);
		
		
		//convert nested array into single stream-pass array and return stream
		String[][] strArray= {{"ABC","BBC"},{"CBC","DBC"},{"EBC","FBC"}};
		Stream<String[]> str=Arrays.stream(strArray);
//		str.flatMap(str1->Arrays.stream(str1)).forEach(System.out::println);
		long result=str.flatMap(str1->Arrays.stream(str1)).filter(str1->str1.charAt(0)=='F').count();//terminal
		System.out.println(result);
		str.close();
		
		System.out.println();
		int[][] group= {{7,6,1},{2,3,9},{5,4,8}};
		Stream<int[]> stream1=Arrays.stream(group);
		stream1.flatMapToInt(intArray->Arrays.stream(intArray)).
		//peek(no->System.out.println("Before filter:"+no)).
		filter(no->no%2==0).
		//peek(no->System.out.println("After filter:"+no)).
		//count();
		//convert int to Integer using boxed, to use comparator interface
		boxed().
		sorted(Comparator.reverseOrder()).
		forEach(System.out::println);
		
		System.out.println();
		int[][] arr1= {{3,1,5},{4,8,2},{9,6,7}};
		Stream<int[]> ints1=Arrays.stream(arr1);
		OptionalInt r1=ints1.flatMapToInt(arr->Arrays.stream(arr))
		.filter(no->no%2==0)
		.reduce((a,b)->(a>b)?a:b);
		//System.out.println(r);
		if(r1.isPresent())
			System.out.println(r1.getAsInt());;
		
	   int[][] arr2= {{3,1,5},{4,8,2},{9,6,7}};
	    Stream<int[]> ints2=Arrays.stream(arr2);
		int r=ints2.flatMapToInt(Arrays::stream)
				.filter(no->no%2==0)
				.sorted()
				.reduce(10,(no1,no2)->no1+no2);
		System.out.println(r);
	}

}
