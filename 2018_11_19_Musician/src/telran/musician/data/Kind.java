package telran.musician.data;

public class Kind {
	
	private String kind;

	public Kind(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "kind=" + kind ;
	}


	

	

}
