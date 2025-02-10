package in.arrays.shifting;

public class MainArrayShifting {
	public static void main(String[] args) {
		ArrayShifting obj=new ArrayShifting();
		int[] intArray= {10,20,30,40,50};
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		obj.leftShift(intArray);//shallow copy ,without returning anything still it changes
		System.out.println();
		System.out.println("After left Shifting:");
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		obj.rightShift(intArray);
		System.out.println();
		System.out.println("After right Shifting:");
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
		for(int i=0;i<3;i++)
			obj.rightShift(intArray);
		System.out.println();
		for(int i=0;i<intArray.length;i++)
			System.out.print(intArray[i]+" ");
	}

}
