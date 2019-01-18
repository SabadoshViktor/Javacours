package telran.computer.controller;

import telran.computers.data.*;

public class ComputerApp {

	public static void main(String[] args) {
		
		Computer comp1 = new Computer(4, 128, "Intel", "DELL");
		Computer comp2 = new Computer(8, 240, "AMD", "Apple");
		Computer comp3 = new Computer(8, 240, "AMD", "Apple");
		System.out.println(comp1);
		System.out.println(comp2);
		
		
		Laptop lap1 = new Laptop(12, 120, "Intel", "Asus", 3, 12);
		System.out.println(lap1);
	
		SmartPhone sm1 = new SmartPhone(4, 32, "SnapDragon", "Samsung", 123456);
		System.out.println(sm1);
		
		Tablet tab1 = new Tablet(6, 500, "A12", "Apple", 10, "Black");
		System.out.println(tab1);
		
		boolean res1 = comp1.equals(comp2);
		System.out.println(res1);
		boolean res2 = comp2.equals(comp3);
		System.out.println(res2);
		boolean res3 = comp3.equals(tab1);
		System.out.println(res3);
		
		Computer comp4 = new Computer(4, 8, "Intel", "Apple");
		Laptop lap4 = new Laptop(4, 8, "Intel", "Apple", 300, 24);
		SmartPhone sm4 = new SmartPhone(4, 8, "Intel", "Apple", 2345);
		boolean res4 = comp4.equals(lap4);
		System.out.println(res4);
		
		boolean res5 = lap4.equals(sm4);
		System.out.println(res5);
		
		String str5 = lap4.getClass().toString();
		System.out.println(str5);

	}

}
