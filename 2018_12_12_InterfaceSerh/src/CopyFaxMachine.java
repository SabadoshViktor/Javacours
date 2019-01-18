
public class CopyFaxMachine implements Copyable, Faxable {

	@Override
	public void fax() {
		System.out.println("I`m can send a fax");
		
	}

	@Override
	public void copy() {
		
		System.out.println("I`m can do copy");
		
	}
	
	public void copyAndFax() {
		System.out.println("I can do copy and send fax");
	}
	
	

}
