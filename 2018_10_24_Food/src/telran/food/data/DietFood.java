package telran.food.data;

public class DietFood extends Food {
	
	private int protein;
	private int sugar;
	private String mineral;
	public DietFood(int calory, String name, int fAT, double price, int protein, int sugar, String mineral) {
		super(calory, name, fAT, price);
		this.protein = protein;
		this.sugar = sugar;
		this.mineral = mineral;
	}
	public int getProtein() {
		return protein;
	}
	public void setProtein(int protein) {
		this.protein = protein;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	public String getMineral() {
		return mineral;
	}
	public void setMineral(String mineral) {
		this.mineral = mineral;
	}
	@Override
	public String toString() {
		return "DietFood [protein=" + protein + ", sugar=" + sugar + ", mineral=" + mineral + ", toString()="
				+ super.toString() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((mineral == null) ? 0 : mineral.hashCode());
		result = prime * result + protein;
		result = prime * result + sugar;
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
		DietFood other = (DietFood) obj;
		if (mineral == null) {
			if (other.mineral != null)
				return false;
		} else if (!mineral.equals(other.mineral))
			return false;
		if (protein != other.protein)
			return false;
		if (sugar != other.sugar)
			return false;
		return true;
	}
	

}
