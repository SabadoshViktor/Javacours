package telran.goat.controller;

import telran.goat.data.Goat;

public class GoatApp {

	public static void main(String[] args) {

		
		Goat goat1 = new Goat();
		goat1.name="Vasya";
		for(int i=0; i<10; i++) {
			goat1.count=goat1.count+1;
		}
		
		System.out.println(goat1.name);
		System.out.println(goat1.count);
		
		Goat goat2=new Goat();
		goat2.name="Petya";
		for(int i=0; i<10; i++) {
			goat2.count=goat2.count+1;
			}
		System.out.println(goat2.name);
		System.out.println(goat2.count);
		
		Goat goat3=new Goat();
		goat3.name="Styopa";
		for(int i=0; i<10; i++) {
			goat3.count=goat3.count+1;
			}
		System.out.println(goat3.name);
		System.out.println(goat3.count);
		}

		
	}


