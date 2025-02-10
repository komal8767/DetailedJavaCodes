package in.arrays.deepshallowcopy;

public class MainShallowCopy {
	public static void main(String[] args) {
		ShallowCopy copy=new ShallowCopy();
	    int[] sourceArr=new int[] {1,2,3,4,5,6};
	    for(int number:sourceArr)
	    	System.out.print(number+" ");
	    System.out.println();
	    copy.shallowCopy(sourceArr);
	    for(int number:sourceArr)
	    	System.out.print(number+" ");
	
	}

}
