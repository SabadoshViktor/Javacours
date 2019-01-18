package telran.musician.data;

public class WindMusician extends Musician {
	
	private int quantityAlcohol;  //количество выпитого алкоголя

	public WindMusician(String firstName, String lastName, int age, MusicInstrument instrument, int quantityAlcohol) {
		super(firstName, lastName, age, instrument);
		this.quantityAlcohol = quantityAlcohol;
	}

	public int getQuantityAlcohol() {
		return quantityAlcohol;
	}

	public void setQuantityAlcohol(int quantityAlcohol) {
		this.quantityAlcohol = quantityAlcohol;
	}

	@Override
	public String toString() {
		return "WindMusician quantityAlcohol=" + quantityAlcohol +"L"+ "," + super.toString() + "";
	}
	
	

}
