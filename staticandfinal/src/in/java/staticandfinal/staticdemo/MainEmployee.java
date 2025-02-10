package in.java.staticandfinal.staticdemo;

public class MainEmployee {
	public static void main(String[] args) {
		
		Employee e1=new Employee("komal",12000,50);
		Employee e2=new Employee("sakshi",30000,90);
		Employee e3=new Employee("divya",20000,10);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		Employee.setCompanyName("Apple");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
	

}
