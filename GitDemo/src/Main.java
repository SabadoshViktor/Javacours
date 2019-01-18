public class Main {

	public static void main(String[] args) {

		
		String input = "abbbcddddddd";
		
		System.out.println(getLongestSubstringLenght(input));
		
		
//		getLongestSubstringLenght(s1[0]);
		
		
	}
	
	public static int getLongestSubstringLenght(String input) {
		int count =1;
		int max = 1;
		for (int i = 0; i < input.length()-1; i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				
				count++;
				max = count;
				
			}
			else {
				count = 1;
			}
			if(count>max) {
				max=count;
			}

			
			
		}
		return max;
		 
		
	}


}
