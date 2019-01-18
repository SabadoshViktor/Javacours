
public class StringTest {

	public static void main(String[] args) {
		
		String str1  = "Hello";
		String str2 = "world!";
		String str3 = " ";
		System.out.println(str1+str3+str2);
		
		String name1 = "Viktor";
		String name2 = "Denis";
		String name3 = "Olga";
		
		greeting(name1);
		greeting(name2);
		greeting(name3);
		
		calculator(25.4, 23.8, "-");

	}
	public static void calculator(double a, double b, String oper) {
		switch(oper) {
		case "+":
			System.out.println(a+b);
			break;
		case "-":
			System.out.println(a-b);
			break;
		case "/":
			System.out.println(a/b);
			break;
		case "*":
			System.out.println(a*b);
			break;
		default:
			System.out.println("Wrong operation");
		}
	}
	
	
	public static void greeting(String name) {
		System.out.println("Hello dear, "+name);
	}

}
