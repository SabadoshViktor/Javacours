package telran.plane.data;

public class DeltaPlane extends Plane {
	
	private int weight;
	private String color;
	public DeltaPlane(int lenght, int width, int sits, String brand, String model, int petrol, int weight,
			String color) {
		super(lenght, width, sits, brand, model, petrol);
		this.weight = weight;
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "DeltaPlane [weight=" + weight + ", color=" + color + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
