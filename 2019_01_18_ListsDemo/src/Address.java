
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
	public String toString() {
		return "Address [street=" + street + ", numOfHouse=" + numOfHouse + "]";
	}
	
	

}
