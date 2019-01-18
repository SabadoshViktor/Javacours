package telran.animal.data;

public class Snake extends Animal {
	
	private int poisonLevel;

	public Snake(int lenght, int weight, String name, int poisonLevel) {
		super(lenght, weight, name);
		this.poisonLevel = poisonLevel;
	}

	public int getPoisonLevel() {
		return poisonLevel;
	}

	public void setPoisonLevel(int poisonLevel) {
		this.poisonLevel = poisonLevel;
	}

	@Override
	public String toString() {
		return "Snake [poisonLevel=" + poisonLevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("sssssssssss");
	}

	@Override
	public void move() {
		System.out.println("Povzaet");
	}

}
