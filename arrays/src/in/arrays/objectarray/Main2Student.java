package in.arrays.objectarray;
import java.util.Arrays;
import java.util.Scanner;
public class Main2Student {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of records to be stored:");
		int size=sc.nextInt();
		Student[] studArr=new Student[size];
		System.out.println("enter student record:");
		int rollNo;
		String name;
		for(int i=0;i<size;i++) {
			System.out.println("RollNo of "+(i+1)+" :");
			rollNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Name of "+(i+1)+" :");
			name=sc.nextLine();
			//studArr[i]=new Student(rollNo,name);
			studArr[i]=new Student();
			studArr[i].setRollNo(rollNo);
			studArr[i].setName(name);
			
			
		}
		
		
		for(int i=0;i<size;i++) {
			System.out.println(studArr[i]);  //.toString()
		}
//		for(Student n:studArr) {
//			System.out.println(n+" ");
//		}
//		System.out.println(Arrays.toString(studArr));
		
		
		
		System.out.println("Enter rollno to find a Record:");
		int no=sc.nextInt();
		int result=binarySearch(studArr,no);
		if(result>0)
			System.out.println(studArr[result]);
		else
			System.out.println("record not found");
		sc.close();
	}
	
	public static int binarySearch(Student[] studArr, int no) {
		int left=0;
		int right=studArr.length-1;
		int mid=0;
		while(left<=right) {
			mid=(left+right)/2;
			if(no==studArr[mid].getRollNo())
				return mid;
			else if(no>studArr[mid].getRollNo())
				left=mid+1;
			else
				right=mid-1;
			
		}
		return -1;
	}

}
