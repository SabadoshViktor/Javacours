package telran.animal.data;

public class Bird extends Animal {
	
	private int highLevel;

	public Bird(int lenght, int weight, String name, int highLevel) {
		super(lenght, weight, name);
		this.highLevel = highLevel;
	}

	public int getHighLevel() {
		return highLevel;
	}

	public void setHighLevel(int highLevel) {
		this.highLevel = highLevel;
	}

	@Override
	public String toString() {
		return "Bird [highLevel=" + highLevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Cipcipcipc");
		
	}

	@Override
	public void move() {
		System.out.println("Letaet");		
	}
		
	

}
