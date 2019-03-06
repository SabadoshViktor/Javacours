package data;

public class Customer {
	
	private String name;
	private int age;
	private BankAccount account;
	
	
	public Customer(String name, int age, BankAccount account) {
		this.name = name;
		this.age = age;
		this.account = account;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public BankAccount getAccount() {
		return account;
	}


	public void setAccount(BankAccount account) {
		this.account = account;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", account=" + account + "]";
	}
	
	

}
