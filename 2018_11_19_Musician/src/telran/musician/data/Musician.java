package telran.musician.data;

public abstract class Musician {
	
	private String FirstName;
	private String LastName;
	private int Age;
	private MusicInstrument Instrument;
	
	public Musician(String firstName, String lastName, int age, MusicInstrument instrument) {
		super();
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Instrument = instrument;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public MusicInstrument getInstrument() {
		return Instrument;
	}
	public void setInstrument(MusicInstrument instrument) {
		Instrument = instrument;
	}
	@Override
	public String toString() {
		return "Musician FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Instrument="+Instrument + "";
	}
	
	
	
}
