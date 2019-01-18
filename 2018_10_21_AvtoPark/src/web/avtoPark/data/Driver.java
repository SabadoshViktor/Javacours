package web.avtoPark.data;

public class Driver {

	private String name;
	private int IDnum;
	public Driver(String name, int iDnum) {
		super();
		this.name = name;
		IDnum = iDnum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIDnum() {
		return IDnum;
	}
	public void setIDnum(int iDnum) {
		IDnum = iDnum;
	}
	
}
