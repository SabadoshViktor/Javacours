package telran.animal.controller;

import telran.animal.data.*;

public class AnimalApp {

	public static void main(String[] args) {
		
		Cat c1 = new Cat(30, 5, "Siri", 190);
		Dog d1 = new Dog(40, 15, "Bobik", 45);
		Bird b1 = new Bird(7, 1, "karkusha", 1000);
		Snake s1 = new Snake(12, 3, "Shlang", 6);
		Fish f1 = new Fish(1, 35, "Nemo", -15000);
		
		c1.voice();
		
		Animal[]chor=new Animal[5];
		chor[0]=c1;
		chor[1]=d1;
		chor[2]=b1;
		chor[3]=s1;
		chor[4]=f1;
		
		cantata(chor);
		
		
	}
	
	public static void cantata(Animal[] chor) {
		for (int i = 0; i < chor.length; i++) {
			chor[i].voice();
		}
	}

}
