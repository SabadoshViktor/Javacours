package telran.food.data;

public class FastFood extends Food {

	private String restName;
	private int holesterin;
	private int speed;
	public FastFood(int calory, String name, int fAT, double price, String restName, int holesterin, int speed) {
		super(calory, name, fAT, price);
		this.restName = restName;
		this.holesterin = holesterin;
		this.speed = speed;
	}
	public String getRestName() {
		return restName;
	}
	public void setRestName(String restName) {
		this.restName = restName;
	}
	public int getHolesterin() {
		return holesterin;
	}
	public void setHolesterin(int holesterin) {
		this.holesterin = holesterin;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	@Override
	public String toString() {
		return "FastFood [restName=" + restName + ", holesterin=" + holesterin + ", speed=" + speed + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + holesterin;
		result = prime * result + ((restName == null) ? 0 : restName.hashCode());
		result = prime * result + speed;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FastFood other = (FastFood) obj;
		if (holesterin != other.holesterin)
			return false;
		if (restName == null) {
			if (other.restName != null)
				return false;
		} else if (!restName.equals(other.restName))
			return false;
		if (speed != other.speed)
			return false;
		return true;
	}
	
}
