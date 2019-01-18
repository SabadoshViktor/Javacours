
public class StringTest {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = new String("Hello");
		
		boolean res = str1==str2;
		System.out.println(res);
		
		String str3 = new String("Hello");
		boolean res2 = str2==str3;
		System.out.println(res2);
		
		boolean res3 = str1.equals(str2);
		System.out.println(res3);
		boolean res4 = str3.equals(str2);
		System.out.println(res4);


		
	}

}
