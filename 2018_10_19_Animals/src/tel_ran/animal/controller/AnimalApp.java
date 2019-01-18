package tel_ran.animal.controller;

import tel_ran.animal.data.*;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal a1=new Animal("Vasya", "Dog", 90, 120);
		Animal a2=new Animal("Kisa", "cat", 120000, 0.2, 1.2);
		System.out.println(a1);
		System.out.println(a2);
		
		HomeAnimal h1 = new HomeAnimal("frosya", "Pig", 20, 0.6, 200, "Pink", "Short");
		System.out.println(h1);
		
		/*WildAnimal w1 = new WildAnimal("Leo", "Tiger", 500, 0.8, 80, 7, 65, false);
		System.out.println(w1);*/
		
		Animal[] animals = {new WildAnimal("Leo", "Tiger", 500, 0.8, 80, 7, 65, false)};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);
		}
		

	}

}
