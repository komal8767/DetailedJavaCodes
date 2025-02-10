package in.arrays.deepshallowcopy;

public class ObjectShalowCopy {
	public static void main(String[] args) {
		ShalowCopy copy=new ShalowCopy();
		copy.setVariable(100);
		System.out.println(copy.getVariable());
		ShalowCopy copy1=copy;
		copy1.setVariable(200);
		System.out.println(copy1.getVariable());
	}


}
