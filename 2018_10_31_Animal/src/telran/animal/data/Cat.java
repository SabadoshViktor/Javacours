package telran.animal.data;

public class Cat extends Animal {
	
	private int iqLevel;

	public Cat(int lenght, int weight, String name, int iqLevel) {
		super(lenght, weight, name);
		this.iqLevel = iqLevel;
	}

	public int getIqLevel() {
		return iqLevel;
	}

	public void setIqLevel(int iqLevel) {
		this.iqLevel = iqLevel;
	}

	@Override
	public String toString() {
		return "Cat [iqLevel=" + iqLevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("Miau-Miau");
	}

	@Override
	public void move() {
		System.out.println("Top-Top");
		
	}
	
	

}
