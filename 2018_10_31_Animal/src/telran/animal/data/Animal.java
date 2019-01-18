package telran.animal.data;

public abstract class Animal {
	
	private int lenght;
	private int weight;
	private String name;
	public Animal(int lenght, int weight, String name) {
		super();
		this.lenght = lenght;
		this.weight = weight;
		this.name = name;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [lenght=" + lenght + ", weight=" + weight + ", name=" + name + "]";
	}
		
	public abstract void voice();
	public abstract void move();
	
}
