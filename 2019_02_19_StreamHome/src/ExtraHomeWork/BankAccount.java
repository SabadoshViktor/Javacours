package ExtraHomeWork;

public class BankAccount {
	
	private Person owner;
	private String IBAN;
	
	
	public BankAccount(Person owner, String iBAN) {
		super();
		this.owner = owner;
		IBAN = iBAN;
	}


	public Person getOwner() {
		return owner;
	}


	public void setOwner(Person owner) {
		this.owner = owner;
	}


	public String getIBAN() {
		return IBAN;
	}


	public void setIBAN(String iBAN) {
		IBAN = iBAN;
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
		return "BankAccount [owner=" + owner + ", IBAN=" + IBAN + "]";
	}
	
	

}
