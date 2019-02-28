package person;

import java.util.List;

public class Person {
	
	private String name;
	private List<BankAccount2> bankAccounts;
	
	
	public Person(String name, List<BankAccount2> bankAccounts) {
		super();
		this.name = name;
		this.bankAccounts = bankAccounts;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<BankAccount2> getBankAccounts() {
		return bankAccounts;
	}
	public void setBankAccounts(List<BankAccount2> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAccounts == null) ? 0 : bankAccounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (bankAccounts == null) {
			if (other.bankAccounts != null)
				return false;
		} else if (!bankAccounts.equals(other.bankAccounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", bankAccounts=" + bankAccounts + "]";
	}
	
	
	
}
