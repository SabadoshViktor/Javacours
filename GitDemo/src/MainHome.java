/*public class MainHome {

	public static void main(String[] args) {

		
		String input = "abbbcddddddddeee";
		
		System.out.println(getLongestSubstringLenght(input));
		
		
//		getLongestSubstringLenght(s1[0]);
		
		
	}
	
	//дз вернути не інт а вернути стрінг....тобто має вернутися строчка bbb або просто найдовша строка
	
	public static String getLongestSubstringLenght(String input) {
		String count ="";
		String max = "";
		for (int i = 0; i < input.length()-1; i++) {
			if(input.charAt(i) == input.charAt(i+1)) {
				count=input.charAt();				
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


}*/