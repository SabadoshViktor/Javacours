
public class Square extends Shape {
	
	private double side;

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public void draw(String color) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fill() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int compareTo(Shape o) {
		if(getArea() > o.getArea()) {
			return 1;
		}
		if(getArea() < o.getArea()) {
			return -1;
		}
		return 0;
	}

	@Override
	public double getArea() {
		return side*4;
	}

	@Override
	public double getCircultLenght() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
