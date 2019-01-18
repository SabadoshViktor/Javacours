import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Shape c1 = new Circle(10.5);
		Shape c2 = new Circle(1.5);
		Shape r1 = new Rectangle(10, 5);
		Shape r2 = new Rectangle(2, 5.7);
		Shape s1 = new Square(25);
		Shape s2 = new Square(4);
		
		
		
		Shape[] shapes = {c1, c2, r1, r2, s1, s2};
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		System.out.println("*********************************************************");
		Arrays.sort(shapes);
		for (int i = 0; i < shapes.length; i++) {
			System.out.println(shapes[i]);
		}
		
	}

}
