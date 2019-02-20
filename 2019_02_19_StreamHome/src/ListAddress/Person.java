package ListAddress;

import java.util.List;

public class Person {
	
	private String name;
	private List<String> bankAccount;
	
	
	public Person(String name, List<String> bankAccount) {
		super();
		this.name = name;
		this.bankAccount = bankAccount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(List<String> bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bankAccount == null) ? 0 : bankAccount.hashCode());
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
		if (bankAccount == null) {
			if (other.bankAccount != null)
				return false;
		} else if (!bankAccount.equals(other.bankAccount))
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
		return "Person [name=" + name + ", bankAccount=" + bankAccount + "]";
	}
	
	

}
