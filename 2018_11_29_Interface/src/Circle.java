
public class Circle extends Shape {
	
	private double radius;
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public double getArea() {
		
		return 3.1415*radius*radius;
	}

	@Override
	public double getCircultLenght() {
		return 2 * 3.14 * radius;
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public void draw(String color) {

		System.out.println("Im circle" + color + "lololo");
		
	}

	@Override
	public void fill() {
System.out.println("fill cir");		
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
	
	
	
	

}
