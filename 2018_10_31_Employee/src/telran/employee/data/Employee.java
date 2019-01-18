package telran.employee.data;

public abstract class Employee {
	
	private int id;
	private String FirstName;
	private String LastName;
	private double hours;
	public Employee(int id, String firstName, String lastName, double hours) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		this.hours = hours;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", hours=" + hours + "]";
	}
	
	public abstract double calculateSalary();
	
	public double taxCalculate(){
		double salary=this.calculateSalary();
		double tax=0;
		int[] levels={0,6220,8920,14320,19900,41410,53333};
		double[] rates={0.1,0.14,0.2,0.31,0.35,0.47,0.5};
		for(int i=0; i<levels.length; i++){
			if(salary>levels[i] || salary<=levels[i+1]){
				return tax+((salary-levels[i])*rates[i]);
			}
			else {
				tax=tax+((levels[i+1]-levels[i])*rates[i]);
			}
		}
		return tax+((salary-levels[levels.length])*rates[rates.length]);
	}
	
	public void showTax() {
		System.out.println(this.getFirstName()+" "+this.getLastName());
		System.out.println("Salary before TAX: "+this.calculateSalary());
		System.out.println("TAX: "+this.taxCalculate());
		System.out.println("Salary after TAX: " + (this.calculateSalary()-this.taxCalculate()));
		System.out.println("*******************************************************************");
	}
	

}
