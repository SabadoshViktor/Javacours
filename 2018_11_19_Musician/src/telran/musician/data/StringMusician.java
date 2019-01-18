package telran.musician.data;

public class StringMusician extends Musician {
	
	private int experience;  //стаж

	public StringMusician(String firstName, String lastName, int age, MusicInstrument instrument, int experience) {
		super(firstName, lastName, age, instrument);
		this.experience = experience;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public String toString() {
		return "StringMusician experience=" + experience + "years"+", toString()=" + super.toString() + "";
	}
	
	

}
