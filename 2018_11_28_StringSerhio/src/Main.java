
public class Main {
	public static void main(String[] args) {
		
		
		String input = "aaa BBB cdFg lKj AAAA"; 
		String input2 = "aaa BBB cdFg lKj AAAA"; 

		String s = transform(input, new ToUperCaseTransformer());     //length==3 -> toUpperCase
		String s2 = transform(input2, new ToLowerCaseTransformer());  //length==4 -> toLowerCase
		String s3 = transform(input2, new ToLowerCaseTransformer());
		
		CheckStringLenght c1 = x -> x.length()==4;
		
		
		
		
		//System.out.println(m1.modifyString(input));
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
