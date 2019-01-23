
public class Address {
	
	private String street;
	private int numOfHouse;
	
	
	public Address(String street, int numOfHouse) {
		super();
		this.street = street;
		this.numOfHouse = numOfHouse;
	}


	public String getStreet() {
		return street;
	}


	public int getNumOfHouse() {
		return numOfHouse;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numOfHouse;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
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
		Address other = (Address) obj;
		if (numOfHouse != other.numOfHouse)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", numOfHouse=" + numOfHouse + "]";
	}
	
	

}
