package telran.bank.data;

public class Adress {
	
	private int PLZ;
	private String Town;
	private String Street;
	private int Number;
	public Adress(int pLZ, String town, String street, int number) {
		super();
		PLZ = pLZ;
		Town = town;
		Street = street;
		Number = number;
	}
	public int getPLZ() {
		return PLZ;
	}
	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}
	public String getTown() {
		return Town;
	}
	public void setTown(String town) {
		Town = town;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getNumber() {
		return Number;
	}
	public void setNumber(int number) {
		Number = number;
	}
	@Override
	public String toString() {
		return "Adress [PLZ=" + PLZ + ", Town=" + Town + ", Street=" + Street + ", Number=" + Number + "]";
	}
	
	

}
