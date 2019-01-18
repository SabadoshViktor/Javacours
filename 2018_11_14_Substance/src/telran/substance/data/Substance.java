package telran.substance.data;

public class Substance {
	
	private String name;
	private double density;
	public Substance(String name, double percent) {
		super();
		this.name = name;
		this.density = percent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDensity() {
		return density;
	}
	public void setDensity(double percent) {
		this.density = percent;
	}
	@Override
	public String toString() {
		return "Substance [name=" + name + ", density=" + density + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(density);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Substance other = (Substance) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(density) != Double.doubleToLongBits(other.density))
			return false;
		return true;
	}
	
	

}
