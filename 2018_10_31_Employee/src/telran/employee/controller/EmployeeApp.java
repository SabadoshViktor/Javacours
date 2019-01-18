package telran.employee.controller;

import telran.employee.dao.*;
import telran.employee.data.*;

public class EmployeeApp {

	public static void main(String[] args) {
		
		SalesManeger s1 = new SalesManeger(777, "Sasha", "Push", 10, 154, 0.1);
		SalesManeger s2 = new SalesManeger(888, "Misha", "Kohut", 50, 12.5, 0.6);
		
		WageEmployee w1 = new WageEmployee(111, "Lesya", "Fish", 1556, 10);
		WageEmployee w2 = new WageEmployee(222, "Sasha", "Gray", 30, 299.99);
		WageEmployee w3 = new WageEmployee(333, "Nasha", "Coka", 180, 100);
		WageEmployee w4 = new WageEmployee(444, "LOL", "Lolovich", 15, 3.2);
		
	/*	System.out.println(w1.calculateSalary());
		System.out.println(w2.calculateSalary());
		System.out.println(w3.calculateSalary());
		
		System.out.println(s1.calculateSalary());
	*/	

		
		
		Company c1 = new Company(10);
		c1.addEmployee(s1);
		c1.addEmployee(s2);
		c1.addEmployee(w1);
		c1.addEmployee(w2);
		c1.addEmployee(w3);
		c1.addEmployee(w4);
	/*	System.out.println("MIN");
		System.out.println(c1.minSalary());
		System.out.println("MAX");
		System.out.println(c1.maxSalary());
		System.out.println("SUM"+c1.sumSalary());
	*/
		
		//System.out.println(c1.EmployeeMinSalary());
	
		//c1.display(c1.PoorMen(3));
		//System.out.println(w1.calculateSalary());
		//System.out.println(c1.taxCalculate(w1));
		
	//	System.out.println(w1.calculateSalary());
	//	System.out.println(w1.taxCalculate());
		
		c1.display();
		System.out.println("");
		s1.showTax();
	
	}
	
	
	


}


