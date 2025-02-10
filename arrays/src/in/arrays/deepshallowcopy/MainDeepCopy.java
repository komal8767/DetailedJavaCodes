package in.arrays.deepshallowcopy;

public class MainDeepCopy {
	public static void main(String[] args) {
		DeepCopy copy=new DeepCopy();
		//copy.copyEachElement(new int[] {1,2,3,4,5,6,});  //we have not specified name so we cannot use it further
	    int[] sourceArr=new int[] {1,2,3,4,5,6};
	    copy.copyEachElement(sourceArr);//sending reference of sourceArr to srcArr
	
	
	}

}
