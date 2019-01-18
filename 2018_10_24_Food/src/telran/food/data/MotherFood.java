package telran.food.data;

public class MotherFood extends Food {
		
	private int fresh;
	private int paika;
	public MotherFood(int calory, String name, int fAT, double price, int fresh, int paika) {
		super(calory, name, fAT, price);
		this.fresh = fresh;
		this.paika = paika;
	}
	public int getFresh() {
		return fresh;
	}
	public void setFresh(int fresh) {
		this.fresh = fresh;
	}
	public int getPaika() {
		return paika;
	}
	public void setPaika(int paika) {
		this.paika = paika;
	}
	@Override
	public String toString() {
		return "MotherFood [fresh=" + fresh + ", paika=" + paika + ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + fresh;
		result = prime * result + paika;
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
		MotherFood other = (MotherFood) obj;
		if (fresh != other.fresh)
			return false;
		if (paika != other.paika)
			return false;
		return true;
	}
	
}
