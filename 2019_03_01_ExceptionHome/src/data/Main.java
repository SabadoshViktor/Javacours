package data;

import java.util.Arrays;
import java.util.List;


import exceptions.InvalidAgeException;
import exceptions.InvalidIbanLebgthlException;
import exceptions.InvalidIbannCountryException;

public class Main {

	public static void main(String[] args) throws InvalidAgeException, InvalidIbannCountryException, InvalidIbanLebgthlException {

		
		Customer c1 = new Customer("Johny", 20, new BankAccount("DE45345349999999"));
		Customer c2 = new Customer("Sasha", 22, new BankAccount("DE45345349999999"));
		Customer c3 = new Customer("Petro", 22, new BankAccount("DE45345349999999"));
		Customer c4 = new Customer("Kolya", 26, new BankAccount("DE45345349999999"));
		Customer c5 = new Customer("Kaxa", 22, new BankAccount("DE45345349999999"));
		Customer c6 = new Customer("Sveta", 20, new BankAccount("DE45345349999999"));
		Customer c7 = new Customer("Lol", 99, new BankAccount("IT4534534549999999"));
		Customer c8 = new Customer("Serho", 22, new BankAccount("DE45345349999999"));
		Customer c9 = new Customer("Masha", 44, new BankAccount("DE45345349999999"));
		Customer c10 = new Customer("Ivan", 55, new BankAccount("DE45345349999999"));
		
		List<Customer> list = Arrays.asList(c1,c2,c3,c4,c5,c6,c7,c8,c9,c10);
		
		validateCustomers(list);
		
		
	}	
	
	public static void validateCustomers(List<Customer> list) throws InvalidAgeException, InvalidIbannCountryException, InvalidIbanLebgthlException {
		for(Customer customer:list) {
			validateCustomer(customer);
		}
	}
	
	public static void validateCustomer(Customer customer)  {
		try {
		validateCustomerAge(customer.getAge());
		} catch (InvalidAgeException ex) {
			System.out.println(ex.getMessage());
		}
		validateBankAccount(customer.getAccount());
		}
	
	public static void validateCustomerAge(int age) throws InvalidAgeException {
		if(age<=17) throw new InvalidAgeException("Invalid age" + age);
	}
	
	public static void validateBankAccount(BankAccount account)  {
			try{
				validateCountryCode(account.getIbann());
			}
			catch (InvalidIbannCountryException e) {
				System.out.println(e.getMessage());
			}
			try{
				validateIbanLength(account.getIbann());
			} catch(InvalidIbanLebgthlException s) {
				System.out.println(s.getMessage());
			}
			
		}
	
	private static void validateCountryCode(String ibann) throws InvalidIbannCountryException{
		if(!ibann.startsWith("DE")) {
			throw new InvalidIbannCountryException("The first symbols is must be 'DE' ");
		}
	}

	private static void validateIbanLength(String ibann) throws InvalidIbanLebgthlException {
		if(ibann.length()!=16) {
			throw new InvalidIbanLebgthlException("The IBAN length is invalid ");
	}


	}
	
}
	
