package tel_ran.animal.data;

public class HomeAnimal extends Animal {
	
	private String color;
	private String hair;
	public HomeAnimal(String name, String type, int population, double height, double weight, String color,
			String hair) {
		super(name, type, population, height, weight);
		this.color = color;
		this.hair = hair;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	@Override
	public String toString() {
		return "HomeAnimals - color is: " + color + ", hair is: " + hair + ",  " + super.toString() + "";
	}
	
	

}
