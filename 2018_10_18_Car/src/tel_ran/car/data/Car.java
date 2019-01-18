package tel_ran.car.data;

public class Car {
	
	private int win;
	private String model;
	private String name;
	private double weight;
	private int size;
	private String color;
	private int power;
	private double motor;
	private String fuel;
	private int year;
	
	
	// it`s GETTERS `
	public int getWin () {
		return win;
	}
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public double getWeight() {
		return weight;
	}
	public int getSize() {
		return size;
	}
	public String getColor() {
		return color;
	}
	public int getPower() {
		return power;
	}
	public double getMotor() {
		return motor;
	}
	public String getFuel() {
		return fuel;
	}
	public int getYear() {
		return year;
	}
	
	//it`s SETTER
	public void setWin(int win) {
		this.win=win;
	}
	public void setModel(String model) {
		this.model=model;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setWeight (double weight) {
		this.weight=weight;
	}
	public void setSize (int size) {
		this.size=size;
	}
	public void setColor (String color) {
		this.color=color;
	}
	public void setPower (int power) {
		this.power=power;
	}
	public void setMotor (double motor) {
		this.motor=motor;
	}
	public void setFuel (String fuel) {
		this.fuel=fuel;
	}
	public void setYear (int year) {
		this.year=year;
	}
	
	
	public void display() {
		System.out.println("Car:");
		System.out.println("Name is: "+name);
		System.out.println("Model is: "+model);
		System.out.println("WIN is: "+win);
		System.out.println("Color is: "+color);
		System.out.println("Size is: "+size);
		System.out.println("Weight is: "+weight+"t");
		System.out.println("Motor is: "+motor+"Liter");
		System.out.println("Fuel is: "+fuel);
		System.out.println("Power is: "+power+"HP");
		System.out.println("Year is: "+year);
	}
	



}



