package telran.employee.data;

import telran.employee.constants.StateConstans;

public class SalesManeger extends Employee {
	
	private double salaryValue;
	private double percent;
	
	public SalesManeger(int id, String firstName, String lastName, double hours, double salaryValue, double percent) {
		super(id, firstName, lastName, hours);
		this.salaryValue = salaryValue;
		this.percent = percent;
	}
	public double getSalaryValue() {
		return salaryValue;
	}
	public void setSalaryValue(double salaryValue) {
		this.salaryValue = salaryValue;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public String toString() {
		return "SalesManeger [salaryValue=" + salaryValue + ", percent=" + percent + ", toString()=" + super.toString()
				+ "]";
	}
	
	@Override
	public double calculateSalary() {
		double salary=getSalaryValue()*getPercent();
		if(salary<super.getHours()*StateConstans.MIN_WAGE) {
			salary=super.getHours()*StateConstans.MIN_WAGE;
		}
		return salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(percent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(salaryValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SalesManeger other = (SalesManeger) obj;
		if (Double.doubleToLongBits(percent) != Double.doubleToLongBits(other.percent))
			return false;
		if (Double.doubleToLongBits(salaryValue) != Double.doubleToLongBits(other.salaryValue))
			return false;
		return true;
	}
	
	

}
