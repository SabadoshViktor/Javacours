package telran.animal.data;

public class Dog extends Animal {
	
	
	private int smellLevel;

	public Dog(int lenght, int weight, String name, int smellLevel) {
		super(lenght, weight, name);
		this.smellLevel = smellLevel;
	}

	public int getSmellLevel() {
		return smellLevel;
	}

	public void setSmellLevel(int smellLevel) {
		this.smellLevel = smellLevel;
	}

	@Override
	public String toString() {
		return "Dog [smellLevel=" + smellLevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Gav-Gav");
	}

	@Override
	public void move() {
		System.out.println("Tup-Tup");		
	}
	
	

}
