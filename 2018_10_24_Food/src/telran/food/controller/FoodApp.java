package telran.food.controller;


import telran.food.data.*;

public class FoodApp {

	public static void main(String[] args) {

		
		DietFood d1 = new DietFood(5, "Kapusta", 5, 1.24, 6, 5, "Kalcium");
		//System.out.println(d1);
		DietFood d2 = new DietFood(6, "Salat", 10, 2.49, 55, 3, "Hloromonius");
		//System.out.println(d2);
		
		FastFood f1 = new FastFood(150, "Doner", 69, 4.1, "Imbis", 654, 5);
		//System.out.println(f1);
		FastFood f2 = new FastFood(500, "cheesBurger", 300, 1.19, "McDonald`s", 800, 1);
		//System.out.println(f2);
		
		MotherFood m1 = new MotherFood(655, "Kotlety", 55, 0.00, 9, 55);
		//System.out.println(m1);
		MotherFood m2 = new MotherFood(458, "Borch", 68, 0.01, 10, 98);
		//System.out.println(m2);
		MotherFood m3 = new MotherFood(458, "Borch", 68, 0.01, 10, 98);
		//System.out.println(m3);
		
		Food[]  foods = {d1, d2, f1, f2, m1, m2};
			for (int i = 0; i < foods.length; i++) {
				//System.out.println(foods[i]);
			}
			
			boolean res1 = f1.equals(f2);
			System.out.println(res1);
			boolean res2 = d2.equals(m1);
			System.out.println(res2);
			boolean res3 = m2.equals(m3);
			System.out.println(res3);
			
	}

}
