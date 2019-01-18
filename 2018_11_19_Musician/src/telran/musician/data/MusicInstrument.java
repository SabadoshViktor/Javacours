package telran.musician.data;

public class MusicInstrument {
	
	private String name;
	private Kind kind;
	
	public MusicInstrument(String name, Kind kind) {
		super();
		this.name = name;
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Kind getKind() {
		return kind;
	}
	public void setKind(Kind kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		return "" + name + " "+ kind;
	}

	


}
