package data;

public class BankAccount {
	
	private String ibann;

	public BankAccount(String ibann) {
		this.ibann = ibann;
	}

	public String getIbann() {
		return ibann;
	}

	public void setIbann(String ibann) {
		this.ibann = ibann;
	}

	@Override
	public String toString() {
		return "BankAccount [ibann=" + ibann + "]";
	}
	
	

}
