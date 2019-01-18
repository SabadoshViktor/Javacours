package Abstract;
public  class ToLowerCaseTransformer extends AbstractTransformer {

	@Override
	public boolean checkLenght(String input) {
		return input.length() == 4;
		}

	@Override
	public String modifyString(String input) {
		return input.toLowerCase();
	}

	

}
