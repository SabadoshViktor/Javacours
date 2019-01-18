package telran.substance.controller;

import telran.substance.dao.*;
import telran.substance.data.*;

public class AlchemyApp {

	public static void main(String[] args) {
		
		Gold g1=new Gold("US Gold", 100, 2);
		Gold g2=new Gold("Pirate Gold", 20, 5);
		
		Shit sh1=new Shit("Cats shit", 5, 100);
		Shit sh2=new Shit("Elephant", 200, 20);
		
		Storage st1 = new Storage(10);
		
		st1.addSubstance(g1);
		st1.addSubstance(g2);
		st1.addSubstance(sh1);
		st1.addSubstance(sh2);
		
		st1.display();
		System.out.println("*********************************************");
		st1.alchemy();
		st1.display();

	}

}
