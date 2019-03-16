import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
	
	public static void main(String[] args) {
		
		String s1 = "aabcd";
		String s2 = "cdaallllb";
		
//		System.out.println(isCyclic(s1, s2));
		InputStream file = null;
		int b = 0;
		
		try {
			file = new FileInputStream("/home/sabadosh/Documents/test.txt");
			while((b=file.read()) != -1) {
				System.out.print((char)b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	
	public static boolean isCyclic(String s1, String s2){
		for (int i = 0; i < s2.length(); i++) {
			String result = (s2.substring(s2.length()-1).concat(s2.substring(0,s2.length()-1)));
			s2=result;
			if(s2.equals(s1)) {
				return true;
			}
		}
		return false;	
	}	
}