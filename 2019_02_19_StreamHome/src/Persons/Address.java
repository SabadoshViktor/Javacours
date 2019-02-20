package Persons;

public class Address {
	
	private String street;
	private int houseNum;
	
	
	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public int getHouseNum() {
		return houseNum;
	}


	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}


	public Address(String street, int houseNum) {
		super();
		this.street = street;
		this.houseNum = houseNum;
	}
	
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + houseNum;
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
		if (houseNum != other.houseNum)
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
		return "Address [street=" + street + ", houseNum=" + houseNum + "]";
	}
	
	
	
	

}
