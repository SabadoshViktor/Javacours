package ExtraHomeWork;

import java.util.List;

public class PersonWithBankAccount {
	
	private String name;
	private List<String> ibans;
	
	
	public PersonWithBankAccount(String name, List<String> ibans) {
		super();
		this.name = name;
		this.ibans = ibans;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<String> getIbans() {
		return ibans;
	}


	public void setIbans(List<String> ibans) {
		this.ibans = ibans;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ibans == null) ? 0 : ibans.hashCode());
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
		PersonWithBankAccount other = (PersonWithBankAccount) obj;
		if (ibans == null) {
			if (other.ibans != null)
				return false;
		} else if (!ibans.equals(other.ibans))
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
		return "PersonWithBankAccount [name=" + name + ", ibans=" + ibans + "]";
	}
	
	

}
