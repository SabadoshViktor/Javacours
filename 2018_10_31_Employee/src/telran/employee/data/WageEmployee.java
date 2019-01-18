package telran.employee.data;

import telran.employee.constants.StateConstans;

public class WageEmployee extends Employee {
	
	private double wage;

	public WageEmployee(int id, String firstName, String lastName, double hours, double wage) {
		super(id, firstName, lastName, hours);
		this.wage = wage;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	@Override
	public String toString() {
		return "WageEmployee [wage=" + wage + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double calculateSalary() {
		double salary=super.getHours()* wage;
		if(wage<StateConstans.MIN_WAGE) {
			wage=StateConstans.MIN_WAGE;
		}
		return salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(wage);
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
		WageEmployee other = (WageEmployee) obj;
		if (Double.doubleToLongBits(wage) != Double.doubleToLongBits(other.wage))
			return false;
		return true;
	}
	
	

}
