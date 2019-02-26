package person;

public class BankAccount2 {
	
	private String IBAN;

	public BankAccount2(String iBAN) {
		super();
		IBAN = iBAN;
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
		BankAccount2 other = (BankAccount2) obj;
		if (IBAN == null) {
			if (other.IBAN != null)
				return false;
		} else if (!IBAN.equals(other.IBAN))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount2 [IBAN=" + IBAN + "]";
	}

	
}
