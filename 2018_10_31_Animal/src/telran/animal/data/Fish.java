package telran.animal.data;

public class Fish extends Animal {
	
	private int deepLevel;

	public Fish(int lenght, int weight, String name, int deepLevel) {
		super(lenght, weight, name);
		this.deepLevel = deepLevel;
	}

	public int getDeepLevel() {
		return deepLevel;
	}

	public void setDeepLevel(int deepLevel) {
		this.deepLevel = deepLevel;
	}

	@Override
	public String toString() {
		return "Fish [deepLevel=" + deepLevel + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void voice() {
		System.out.println("POPOPOPOPO");
	}

	@Override
	public void move() {
		System.out.println("Plavle-Plavle-MayShikovno-MayShikovno");
	};
	

}
