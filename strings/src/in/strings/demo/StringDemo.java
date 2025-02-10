package in.strings.demo;

import in.strings.entities.Employee;
import in.strings.entities.Student;

public class StringDemo {
	public static void main(String[] args) {
		String name1="komal";
		String name2="komal";
		String name3=new String("komal");
		String name4=new String("komal");
		System.out.println(name1==name2);
		System.out.println(name3==name2);
		System.out.println(name3==name4);
		String name5=name4; //shallow copy
		System.out.println(name5==name4);
		
		
		
		System.out.println();
		Student stud=new Student();
		Student stud1=new Student();
		Student stud3=stud;//shallow copy
		System.out.println(stud3==stud);
		
		Employee e1=new Employee();
		//stud.setCity("loni");
		stud.setCity(new String("loni"));
		e1.setArea("loni");
		if(stud.getCity()==e1.getArea()) //compare reference of object 
			System.out.println("city and area are same object in constant pool");
		else
			System.out.println("not equal");
		
		stud1.setCity("loni");
		System.out.println(stud.getCity()==stud1.getCity());
		System.out.println();
		System.out.println(stud.getCity()==stud3.getCity());
		
	}

}
