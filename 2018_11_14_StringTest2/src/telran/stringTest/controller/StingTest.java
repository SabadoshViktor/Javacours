package telran.stringTest.controller;

public class StingTest {

	public static void main(String[] args) {

		char c = '4';
		boolean check=false;
		if(Character.isDigit(c)) {
			check=true;
		}
		System.out.println(check);
		
		String str = new String("Hello");
		char [] chars = {' ', 'w', 'o', 'r', 'l', 'd'};
		
		String str1 = new String(chars);
		System.out.println(str1);
		str=str+str1;
		System.out.println(str);
		
		System.out.println(str.length());
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		String str2 = " WORLD";
		System.out.println(str2.equalsIgnoreCase(str1));
		
		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.indexOf("LD"));
		
		System.out.println(str2.lastIndexOf('W'));
		
		String newStr = str.replace("el", "ZZZ");
		System.out.println(newStr);
		
		

	}
}