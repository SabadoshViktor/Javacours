package IBAN;

public class BankAccount {

	private String IBAN;
	private Person owner;
	
	
	public BankAccount(String iBAN, Person owner) {
		super();
		IBAN = iBAN;
		this.owner = owner;
	}
	public String getIBAN() {
		return IBAN;
	}
	public Person getOwner() {
		return owner;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((IBAN == null) ? 0 : IBAN.hashCode());
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
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
		BankAccount other = (BankAccount) obj;
		if (IBAN == null) {
			if (other.IBAN != null)
				return false;
		} else if (!IBAN.equals(other.IBAN))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BankAccount [IBAN=" + IBAN + ", owner=" + owner + "]";
	}
	
	
	
}
