package telran.bank.controller;

import telran.bank.dao.Bank;
import telran.bank.data.*;

public class BankApp {

	public static void main(String[] args) {
		
		
		Adress a1 = new Adress(13585, "Berlin", "Askanierring", 1);
		Adress a2 = new Adress(13575, "Potsdam", "Pushkin", 2);
		Adress a3 = new Adress(13585, "Berlin", "Askanierring", 3);
		Adress a4 = new Adress(13585, "Berlin", "Askanierring", 4);
		Adress a5 = new Adress(13585, "Berlin", "Askanierring", 5);

		Person p1 = new Person(857, "PIPI", "OLOLO", a1);
		Person p2 = new Person(85, "Mark", "Cukenberg", a2);
		Person p3 = new Person(658, "Den", "Muz", a3);
		Person p4 = new Person(12, "Vasil", "Stepanenko", a4);
		Person p5 = new Person(877, "Doc", "Zlo", a5);

		BankAccount ba1 = new BankAccount(87, p1, 1);
		BankAccount ba2 = new BankAccount(411, p2, 2);
		BankAccount ba3 = new BankAccount(47, p3, 3);
		BankAccount ba4 = new BankAccount(57, p4, 4);
		BankAccount ba5 = new BankAccount(88, p5, 5);
		
		

		Bank myBank = new Bank(10);
		myBank.addBankAccount(ba1);
		myBank.addBankAccount(ba2);
		myBank.addBankAccount(ba3);
		myBank.addBankAccount(ba4);
		myBank.addBankAccount(ba5);
		///myBank.display();
		//System.out.println(myBank.getSize());
		
		//**************************************************
		System.out.println(myBank.getBalanceOfBank());
		myBank.closeAccount(88);
		myBank.display();
		System.out.println(myBank.getBalanceOfBank());
		ba2.credit(1);
		System.out.println(ba2.getBallance());
		
		//System.out.println("***************************************************************************************************");
		
		myBank.closeBankAccount(ba4);
		//myBank.display();
		//System.out.println(myBank.getSize());
		
		
		myBank.addBankAccount(ba2);   
		
		
		myBank.search(p1);   //возвращает номер акаунта персоны задавая саму персону

		myBank.search2(857);		 //возвращает номер акаунта персоны задавая ID персоны
		
		myBank.search3(ba4);			//возвращает ID всех персон

		
		//System.out.println(myBank.getBalanceOfTheBank(myBank));
		
		myBank.getBalanceOfTheBank2(myBank); //сумирует только баланс первого 
		
		//myBank.getAll(myBank);
		
		
		
		

		
		
	}

}
