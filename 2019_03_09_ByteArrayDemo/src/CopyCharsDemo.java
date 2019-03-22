import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;


public class CopyCharsDemo {
	
//	public static void main(String[] args) {
//		
//		try (FileReader reader = new FileReader("test.txt"))	 {
//			int c;
//			while ((c = reader.read()) != -1) {
//				System.out.print((char)c);
//			}
//		} catch (IOException ex) {
//			ex.printStackTrace();
//			}
//		
//	}

	
	
			
			public static void main(String[] args) {
			
			try (BufferedReader reader = new BufferedReader(new FileReader("test.txt")))	 {
				Stream<String> lines = reader.lines();
				lines.forEach(s -> System.out.println(s));
			} catch (IOException ex) {
				ex.printStackTrace();
				}
			//printWriter posmotrety doma
		}
}
