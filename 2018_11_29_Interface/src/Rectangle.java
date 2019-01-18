
public class Rectangle extends Shape implements Drawable {
	

	private double height;
	private double width;

	
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}



	@Override
	public double getArea() {
		return height*width;
	}
	
	@Override
	public double getCircultLenght() {
		return 2*height+2*width;
	}



	@Override
	public void draw(String color) {

		System.out.println("Im a " + color + "kakashka"	);
		
	}



	@Override
	public void fill() {
System.out.println("fill rect");		
	}


	@Override
	public String toString() {
		return "Rectangle [height=" + height + ", width=" + width + "]";
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
