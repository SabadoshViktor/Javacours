package telran.product.controller;

import telran.product.dao.Supermarket;
import telran.product.data.*;

public class ProductApp {

	public static void main(String[] args) {

		MilkProduct m1 = new MilkProduct(111111111, "Kefir", "Milk", "Kalinka", 1.69, 33.5);
		VegetableProduct v1 = new VegetableProduct(55555, "Kartoshka", "Ovoch", "Batyka", 0.88, 55);
		
		Supermarket s1 = new Supermarket(10);
		s1.addProduct(v1);
		s1.addProduct(m1);
		
		System.out.println(s1.findByBarCode(55555));
		
		
		
		
	}

}
