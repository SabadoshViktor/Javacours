
public class FaxDevice implements Faxable2{

	@Override
	public boolean fax(String document) {
		return document.length() == 5;
	}

}
