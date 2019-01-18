package telran.bank.dao;

import telran.bank.data.*;



public class Bank {
	
	private BankAccount[] accounts;
	private int size;
	
	public Bank(int capacity) {
		accounts = new BankAccount [capacity];
	}

	public int getSize() {
		return size;
	}
	
	public int checkAccount(int account) {
		for (int i = 0; i < size; i++) {
			if(account==accounts[i].getAccount()) {
				return i;
			}
		}
		return -1;
	}
	
	public boolean AddAccount(BankAccount account) {
		if(checkAccount(account.getAccount())>=0) {
			return false;
		}
		if(size<accounts.length) {
			accounts[size]=account;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean addBankAccount(BankAccount bankAccaunt) {
		if(size<accounts.length) {
			accounts[size]=bankAccaunt;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean closeAccount(int account) {
		int index=checkAccount(account);
		if(index<0) {
			return false;
		}
		accounts[index]=accounts[size-1];
		size--;
		return true;
	}
	
	
	
	public boolean closeBankAccount(BankAccount bankAccaunt) {
		for (int i = 0; i < size; i++) {
			if(accounts[i].equals(bankAccaunt)) {
				accounts[i]=accounts[size-1];
				size--;
				return true;
			}
		}
		return false;
	}
	

	public BankAccount searchDEN(int id) {
		for (int i = 0; i < size; i++) {
			if(id==accounts[i].getOwner().getId()) {
				return accounts[i];
			}
		}
		return accounts[size+1];
	}
	
	
	public int search(Person person) {
		for (int i = 0; i < size; i++) {
			if(accounts[i].getOwner().getId() ==  accounts[i].getOwner().getId()) {
				return accounts[i].getAccount();
			}
		}
		return -1;
	}
	
	public int search2(int id) {
		for (int i = 0; i < size; i++) {
			if(accounts[i].getOwner().getId() ==  id) {
				return accounts[i].getAccount();
			}
		}
		return -1;
	}
	
	public void search3(BankAccount bankAccaunt) {
		for (int i = 0; i < size; i++) {
			if(accounts[i].getOwner().getId() ==  accounts[i].getOwner().getId()) {
				//System.out.println(accounts[i].getOwner().getId());
			}
		}
		
	}
	
	
	public double getBalanceOfBank() {
		double sum=0;
		for (int i = 0; i <size; i++) {
			sum=sum+accounts[i].getBallance();
		}
		return sum;
	}
	
	
	/*public double getBalanceOfTheBank(Bank bank) {
		double ALL=0;
		for (int i = 0; i <size; i++) {
			i=0;
			ALL = accounts[0].getBallance()+accounts[1].getBallance()+accounts[2].getBallance()+accounts[3].getBallance()+accounts[4].getBallance();
			return ALL;
		}
		return ALL;
	}*/
	
	

	
	public double getBalanceOfTheBank2(Bank bank) {
		double ALL=0;
		for (int i = 0; i <size;) {
			ALL = accounts[i].getBallance()+accounts[i+1].getBallance();
			return ALL;
		}
		System.out.println(ALL);
		return ALL;
	}
	
	public BankAccount[] findAll() {
		BankAccount[]res=new BankAccount[size];
		for (int i = 0; i < size; i++) {
			res[i]=accounts[i];
		}
		return res;
	}
	
	public void getAll(Bank myBank) {
		myBank.display();
	}

	
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(accounts[i]);
		}
	}

	

}
