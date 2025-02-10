package in.java.staticandfinal.staticdemo;

public class Employee {
	String name;
	float salary;
	final int RETIREMENT_AGE;
	static String companyName;
	public Employee(String name, float salary, int RETIREMENT_AGE) {
		this.name=name;
		this.salary=salary;
		this.RETIREMENT_AGE=RETIREMENT_AGE;
	}
	static {
		companyName="Capgemini";
	}
	public String getName() {
		return name;
	}
	public float getSalary() {
		return salary;
	}
	public int getRETIREMENT_AGE() {
		return RETIREMENT_AGE;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", RETIREMENT_AGE=" + RETIREMENT_AGE +",company name="+companyName+ "]";
	}

}
