package Abstract;

public class MainAbstract {

	public static void main(String[] args) {

		String input1 = "aaa BBB cdFg lKj AAAA"; 
		String input2 = "aaa BBB cdFg lKj AAAA"; 

		String s = transform(input1, new ToUperCaseTransformer());    //length==3 -> toUpperCase
		String s2 = transform(input2, new ToLowerCaseTransformer());  //length==4 -> toLowerCase
		
		
		
	}
	
	
	public static String transform(String input, AbstractTransformer t) {
		String [] words = input.split(" ");
		
		for (int i = 0; i < words.length; i++) {
				if(t.checkLenght(words[i])) {
					words[i]=t.modifyString(words[i]);		
			}
	
		}
		return String.join(" ", words);
	}


}
