package in.java8features.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import in.java8features.streamapientities.Student;

public class MainStuent {
	public static void main(String[] args) {
		Student[] studArr=new Student[5];
		studArr[0]=new Student("ab",11,12000,"loni");
		studArr[1]=new Student("bc",12,14000,"supa");
		studArr[2]=new Student("cd",13,15000,"loni");
		studArr[3]=new Student("ef",14,16000,"nimon");
		studArr[4]=new Student("gh",15,17000,"sangamner");
		
		Stream<Student> studStream=Arrays.stream(studArr);
		String[] names=studStream.map(student->student.getName()).
				//toArray(size->new String[size]);
				sorted(Comparator.reverseOrder()).toArray(String[]::new);
				System.out.println(Arrays.toString(names));
				
		System.out.println("Array:");		
		Stream<Student> studStream1=Arrays.stream(studArr);
		String[] area=studStream1.map(obj->obj.getArea()).
				//map(Student::getArea).
				distinct().sorted().toArray(String[]::new);
		for(String a:area)
			System.out.println(a);
		
		System.out.println("total fee of loni:");
		Stream<Student> studStream2=Arrays.stream(studArr);
		double totalfee=studStream2.filter(stud->stud.getArea().equals("loni")).
				mapToDouble(Student::getFees).sum();
		System.out.println(totalfee);
		
		System.out.println("max fee:");
		Stream<Student> studStream3=Arrays.stream(studArr);
		OptionalDouble maxfee=studStream3.mapToDouble(Student::getFees).max();
		maxfee.ifPresent(fees->System.out.println(fees));
		
		System.out.println("Max fee of loni:");
		Stream<Student> studStream4=Arrays.stream(studArr);
		OptionalDouble maxfeeofloni=studStream4.
				filter(stud->stud.getArea().equals("loni")).
				mapToDouble(Student::getFees).max();
		maxfeeofloni.ifPresent(fees->System.out.println(fees));
	}
	

}
