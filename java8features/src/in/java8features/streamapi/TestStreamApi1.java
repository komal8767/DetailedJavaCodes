package in.java8features.streamapi;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TestStreamApi1 {
	public static void main(String[] args) {
		int[][] intArray= {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> intStream=Arrays.stream(intArray);
		int[] s=intStream.flatMapToInt(Arrays::stream).
				filter(no->no%2==0).toArray();
		System.out.println(Arrays.toString(s));
		
		
		int[][] intArray1= {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> intStream1=Arrays.stream(intArray1);
		OptionalDouble average=intStream1.flatMapToInt(Arrays::stream).
				average();
		average.ifPresent(System.out::println);
		
		
		int[][] intArray2= {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> intStream2=Arrays.stream(intArray2);
		OptionalInt firstElement=intStream2.flatMapToInt(Arrays::stream).
				findFirst();
		if(firstElement.isPresent())
			System.out.println(firstElement.getAsInt());
		
		
		int[][] intArray3= {{1,2,3},{4,5,6},{7,8,9}};
		Stream<int[]> intStream3=Arrays.stream(intArray3);
		boolean isPresent=intStream3.flatMapToInt(Arrays::stream).
				anyMatch(no->no==2);
		System.out.println(isPresent);
		
	
		
	}

}
