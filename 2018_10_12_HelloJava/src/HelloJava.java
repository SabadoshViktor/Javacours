
public class HelloJava {

	public static void main(String[] args) {

		System.out.println("Hello");
		System.out.println("I`m Java programmer");
		System.out.println("I`m superman");
		
		int a=25;
		
		System.out.println(a+" Some text "+a);
		
		float b=3.15f;
		System.out.println(b);
		
		double bubble=45.286;
		System.out.println(bubble);
		
		long l=100500659845645l;
		System.out.println(l);
		
		double db=3.145;
		int c = (int)db;
		System.out.println(c);
		
		int y=1;
		y++;
		System.out.println(y);
		y--;
		System.out.println(y);
		
		boolean boo=2<3;
		System.out.println(boo);
		
		introduce();
		clown();
		
		int height=165;
		if(height>180) {
			System.out.println("Go to Circus");
		}
		else {
			System.out.println("You are Clown");
		}
		army(19);
		
		fan(2);
		sumDigits(4567);
		powXY(5, 3);
		
		
	
		
	}
	
	
	private static void powXY(int x, int y) {
		int res=1;
		for(int i=1; i<=y; i++) {
			res=res*x;
		}
		System.out.println("Pow is "+res);
	}
	
	
	private static void sumDigits(int num) {
		int res=0;
		while(num!=0) {
			res=res+num%10;
			num=num/10;
		}
		System.out.println("Sum is: "+res);
	}
	
	private static void fan(int mode) {
		switch(mode) {
		case 0:
			System.out.println("fan is off");
			break;
		case 1:
			System.out.println("fan is min");
			break;
		case 2:
			System.out.println("fan is height");
			break;
		default:
			System.out.println("wrong mode");
		}
	}
	
	
	private static void army(int age) {
		if(age>=18 && age<=45) {
			System.out.println("Go aboard");
		}
		else {
			System.out.println("Lucky man");
		}
	}
	
	private static void introduce() {
		System.out.println("Hello my name is");
	}
	
	private static void clown() {
		System.out.println("Hello i`m clown");
		System.out.println("I`m Oleg Popov");
	}

}
