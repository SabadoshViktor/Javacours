
public class MainReturnString {
	

		public static void main(String[] args) {
			
			String input = "abbbbcdddddddd";
			
			System.out.println(getLongestSubstringLenght(input));
			
			
				
		}
		public static String getLongestSubstringLenght(String input) {
			int count = 1;
			String max ="" ;
			
			for (int i = 0; i < input.length()-1; i++) {
				if(input.charAt(i) == input.charAt(i+1)) {
					count++;
					max = "";
				}
				else {
					count = 1 ;
				}
				if(max.length()>count) {
					count=max.length();
				}			
			}
			return max;			
		}

}

