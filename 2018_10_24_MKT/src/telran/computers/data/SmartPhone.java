package telran.computers.data;

public class SmartPhone extends Computer {
	
	private int imei;


	public SmartPhone(int rAM, int hdd, String cpu, String brand, int imei) {
		super(rAM, hdd, cpu, brand);
		this.imei = imei;
	}


	public int getImei() {
		return imei;
	}


	public void setImei(int imei) {
		this.imei = imei;
	}


	@Override
	public String toString() {
		return "SmartPhone [imei=" + imei + ", toString()=" + super.toString() + "]";
	}




}
