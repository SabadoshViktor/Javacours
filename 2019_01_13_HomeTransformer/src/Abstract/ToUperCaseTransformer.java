package Abstract;
public class ToUperCaseTransformer extends AbstractTransformer{

	@Override
	public boolean checkLenght(String input) {
		return input.length() == 3;
		}

	@Override
	public String modifyString(String input) {
		return input.toUpperCase();
	}
	
	


}
