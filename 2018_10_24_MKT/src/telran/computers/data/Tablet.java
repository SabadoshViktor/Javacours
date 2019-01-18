package telran.computers.data;

public class Tablet extends Computer {
	
	
	private double screensize;
	private String color;
	public Tablet(int ram, int hdd, String cpu, String brand, double screensize, String color) {
		super(ram, hdd, cpu, brand);
		this.screensize = screensize;
		this.color = color;
	}

	public double getScreensize() {
		return screensize;
	}

	public void setScreensize(double screensize) {
		this.screensize = screensize;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Tablet [screensize=" + screensize + ", color=" + color + ", toString()=" + super.toString() + "]";
	}



	
	

}
