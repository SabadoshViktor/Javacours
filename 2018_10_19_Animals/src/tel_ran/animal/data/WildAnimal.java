package tel_ran.animal.data;

public class WildAnimal extends Animal {
	
	private int aggresiveLevel;
	private double speed;
	private boolean sort;
	
	public WildAnimal(String name, String type, int population, double height, double weight, int aggresiveLevel,
			double speed, boolean sort) {
		super(name, type, population, height, weight);
		this.aggresiveLevel = aggresiveLevel;
		this.speed = speed;
		this.sort = sort;
	}
	
	public int getAggresiveLevel() {
		return aggresiveLevel;
	}
	public void setAggresiveLevel(int aggresiveLevel) {
		this.aggresiveLevel = aggresiveLevel;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getSort() {
		if (sort) {
			return "Gracce";
		}
		else {
		return "Meet";
		}
	}
	public void setSort(boolean sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "WildAnimal - aggresiveLevel is: " + aggresiveLevel  + " , speed is: " + speed + ", sort is: " + getSort() + ", "
				+ super.toString() + " ";
	}
	
	
	
	
	
	
}
