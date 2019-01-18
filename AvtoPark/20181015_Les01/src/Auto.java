
public class Auto {
	// private Engine engine;
	private String model;
	private String color;
	double weight;
	int year;
	private boolean isEngineOn;

	public void setModel(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public Auto() {
	}

	public Auto(String model, String color, double weight, int year, boolean isEngineOn) {
		this.model = model;
		this.color = color;
		this.weight = weight;
		this.year = year;
		this.isEngineOn = isEngineOn;
	}

	public Auto(String model, String color, double weight, int year) {
		this.model = model;
		this.color = color;
		this.weight = weight;
		this.year = year;
	}

	void engineOn() {
		isEngineOn = true;
	}

	void engineOff() {
		isEngineOn = false;
	}

	void print(int k) {

		System.out.println("--print with int---");
	}
	void print() {
		System.out.println("Auto: model is " + model + " color is " + color + " year is " + year);
		printEngineStatus();

	}

	void printEngineStatus() {

		System.out.println("Engine is " + (isEngineOn ? "On" : "Off"));
	}

}

// if (uslovie) {uslovie verno} else {uslovie ne verno}
// (uslovie)? uslovie verno : uslovie ne verno
