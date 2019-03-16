import java.util.Arrays;
import java.util.List;

		public class Main2 {

			public static void main(String[] args) {
				
				List<String> list = Arrays.asList("aaa", "bbbb", "a", "bbb");
				list.stream().forEach(System.out::println);
				System.out.println("*************************************");
				list.stream().sorted().forEach(System.out::println);
				
			}
			
			
//			public static int sumNumsFromFile ( file ) {
//				
//			}

		}
	


