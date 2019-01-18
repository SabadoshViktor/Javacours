package tel_ran.animal.data;

public class Animal {
	
	private String name;
	private String type;
	private int population;
	private double height;
	private double weight;
	
	public Animal(String name, String type, int population, double height, double weight) {
		this.name=name;
		this.type=type;
		this.population=population;
		this.height=height;
		this.weight=weight;
	}

	public Animal(String name, String type, double height, double weight) {
		
		this.name = name;
		this.type = type;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "name is: " + name + ", type is:" + type + ", population is:" + population + ", height is:" + height
				+ ", weight is:" + weight + "";
	}
	
	
	
	
	
	
	
}
