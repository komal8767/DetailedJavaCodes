package in.arrays.objectarray;

public class MainStudent {
	public static void main(String[] args) {
//		Student[] studArr;
//		System.out.println(studArr[0]); //not initialized
//		Student[] studArr=new Student[5];
//		studArr[0].setName(null);  //nullpointerexception-we have to again allocate
		//the separate memory for each object
		Student[] studArr=new Student[5];
		System.out.println(studArr[0]);  //null
//		
//		
		studArr[0]=new Student();
		studArr[0].setName("komal");
		studArr[0].setRollNo(10);
		System.out.println(studArr[0].getName());
		System.out.println(studArr[0].getRollNo());
		
		
		Student[] studArrary= {new Student(), new Student(), new Student()};
		studArrary[0].setName("gaurav");
		studArrary[0].setRollNo(17);
		studArrary[1].setName("payal");
		studArrary[1].setRollNo(18);
		studArrary[2].setName("nikita");
		studArrary[2].setRollNo(19);
		System.out.println(studArrary[0].getName());
		System.out.println(studArrary[0].getRollNo());
		System.out.println(studArrary[1].getName());
		System.out.println(studArrary[1].getRollNo());
		System.out.println(studArrary[2].getName());
		System.out.println(studArrary[2].getRollNo());
	
//		Student[] obj;            //late initialization
//		obj=new Student[] {new Student()};
		
		
		
	}

}
