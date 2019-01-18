package telran.plane.data;

public class Plane {
	
	private int lenght;
	private int width; //ширина
	private int sits;
	private String brand;
	private String model;
	private int petrol;
	
	
	public Plane(int lenght, int width, int sits, String brand, String model, int petrol) {
		super();
		this.lenght = lenght;
		this.width = width;
		this.sits = sits;
		this.brand = brand;
		this.model = model;
		this.petrol = petrol;
	}


	public int getLenght() {
		return lenght;
	}


	public void setLenght(int lenght) {
		this.lenght = lenght;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getSits() {
		return sits;
	}


	public void setSits(int sits) {
		this.sits = sits;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPetrol() {
		return petrol;
	}


	public void setPetrol(int petrol) {
		this.petrol = petrol;
	}


	@Override
	public String toString() {
		return "Plane [lenght=" + lenght + ", width=" + width + ", sits=" + sits + ", brand=" + brand + ", model="
				+ model + ", petrol=" + petrol + "]";
	}
	
	public int calculateTrip(int time) {
		int res=0;
		res = time*petrol;
		return res;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + lenght;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + petrol;
		result = prime * result + sits;
		result = prime * result + width;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plane other = (Plane) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (lenght != other.lenght)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (petrol != other.petrol)
			return false;
		if (sits != other.sits)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	
	
}
