package telran.employee.dao;

import telran.employee.data.*;

public class Company {
	
	private Employee[] employees;
	private int companySize;
	
	public Company(int capacity) {
		employees = new Employee[capacity];
		companySize = 0;
	}
	
	
	
	public int getCompanySize() {
		return companySize;
	}
	
	public boolean addEmployee(Employee employee) {
		if(companySize<employees.length) {
			employees[companySize]=employee;
			companySize++;
			return true;
		}
		return false;
	}
	
	public boolean removeEmployee(Employee employee) {
		for (int i = 0; i < companySize; i++) {
			if(employees[i].equals(employee)) {
				employees[i]=employees[companySize-1];
				companySize--;
				return true;
			}
		}
		return false;
	}
	
	public Employee getEmployeeByID(int id) {
		if(id>companySize-1) {
			return employees[companySize-1];
		}
		if(id<0) {
			return employees[0];
		}
		return employees[id];
	}
	
	public  double minSalary(){
		double min=employees[0].calculateSalary();
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()<min){
				min=employees[i].calculateSalary();
			}
		}
		return min;
	}
	
	

	public  double maxSalary(){
		double max=employees[0].calculateSalary();
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()>max){
				max=employees[i].calculateSalary();
			}
		}
		return max;
	}
	
	public  double sumSalary(){
		double sum=0;
		for (int i = 0; i < companySize; i++) {
			sum=sum+employees[i].calculateSalary();
			
			}
		return sum;
	}
	
	public  Employee EmployeeMinSalary(){
		Employee employee=employees[0];
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()<employee.calculateSalary()){
				employee=employees[i];
			}
		}
		return employee;
	}
	
	
	
	public int searchEmployee(Employee employee) {
		for (int i = 0; i < companySize; i++) {
			if(employees[i].equals(employee)) {
				return i;
			}
		}
		return -1;
	}
	
	public void display(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
	}
	
	public void display() {
		for (int i = 0; i < companySize; i++) {
			employees[i].showTax();

		}
	}
	
	
	
	
	public Employee[] PoorMen(int num) {
		double minSalary = this.minSalary();
		Employee[] min = new Employee[num];
		int size=0;
		for (int i = 0; i < companySize; i++) {
			if(employees[i].calculateSalary()==minSalary && size<num) {
				min[size]=employees[i];
				size++;
		}
	}
		return min;
}

	public double taxCalculate(Employee employee){
		double tax=0;
		int[] levels={0,6220,8920,14320,19900,41410,53333};
		double[] rates={0.1,0.14,0.2,0.31,0.35,0.47,0.5};
		for(int i=0; i<levels.length; i++){
			if(employee.calculateSalary()>levels[i] || employee.calculateSalary()<=levels[i+1]){
				return tax+((employee.calculateSalary()-levels[i])*rates[i]);
			}
			else {
				tax=tax+((levels[i+1]-levels[i])*rates[i]);
			}
		}
		return tax+((employee.calculateSalary()-levels[levels.length])*rates[rates.length]);
	}
	

	
	
	
	
}

