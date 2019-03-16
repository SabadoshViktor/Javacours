
public class Main {

	public static void main(String[] args) {

		SuperBoss boss1 = SuperBoss.getInstance();
		Employee e1 = new Employee("Piotr", boss1);
		
		SuperBoss boss2 = SuperBoss.getInstance();
		Employee e2 = new Employee("Ivan", boss2);
		
//		System.out.println(e1);
//		System.out.println(e2);
//		
		
		System.out.println(String.valueOf(boss1));
		
	}

}
