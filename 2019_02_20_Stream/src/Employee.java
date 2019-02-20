
public class Employee {
	
	private String name;
	private int salary;
	
	
	public Employee(String name, int age) {
		this.name = name;
		this.salary = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int age) {
		this.salary = age;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	

}
