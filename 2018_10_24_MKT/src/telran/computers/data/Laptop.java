package telran.computers.data;

public class Laptop extends Computer {
	
	private int weight;
	private int hours;

	public Laptop(int ram, int hdd, String cpu, String brand, int weight, int hours) {
		super(ram, hdd, cpu, brand);
		this.weight = weight;
		this.hours = hours;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Laptop [weight=" + weight + ", hours=" + hours + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}


