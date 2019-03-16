
public class Employee {
	
	String name;
	SuperBoss boss;
	
	
	public Employee(String name, SuperBoss boss) {
		this.name = name;
		this.boss = boss;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", boss=" + boss + "]";
	}
	
	

}
