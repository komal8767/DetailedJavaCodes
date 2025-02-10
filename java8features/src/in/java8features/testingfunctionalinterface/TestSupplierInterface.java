package in.java8features.testingfunctionalinterface;

import java.util.Arrays;
import java.util.function.Supplier;

import in.java8features.testingfunctionalinterface.entities.SupplierObjects;

public class TestSupplierInterface {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=SupplierObjects.randomInt.get();
		}
		

		System.out.println(Arrays.toString(arr));
	}

}
