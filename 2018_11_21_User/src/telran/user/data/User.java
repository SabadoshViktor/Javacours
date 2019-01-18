package telran.user.data;

public class User {
	
	private String email;
	private String password;
	
	public User(String email, String password) {
		setEmail(email);
		setPassword(password);
	}
	
	private void setPassword(String password) {
		
			this.password = password;
		
	}
	
/*	private boolean checkPassword(String password) {
		boolean [] res = new boolean[5];
		int lenght = password.length();
		if(lenght>=8) {
			res[0]=true;
		}
		for(int i=0; i<lenght; i++) {
			char c= password.charAt(i);
			if(Character.isUpperCase(c)) {
				res[1]=true;
			}
			if(Character.isLowerCase(c)) {
				res[2]=true;
			}
			if(Character.isDigit(c)) {
				res[3]=true;
			}
			if(isSpecialSymbol(c)) {
				res[4]=true;
			}
			
		}
		
		for(int i=0; i<res.length; i++) {
			if(res[i]==false) {
				return false;
			}
		}
		return true;
		
	}
	
	private boolean isSpecialSymbol(char c) {
		char [] specials = {'*','&','%','!','$'};
		for (int i = 0; i < specials.length; i++) {
			if(c==specials[i]) {
				return true;
			}
		}
		return false;
	}
*/	
	private void setEmail(String email) {
			this.email=email;
		}
	
	

/*	private boolean checkEmail(String email) {
		int at=email.indexOf('@');
		if(at<=0 || at!= email.lastIndexOf('@')) {
			return false;
		}
		if(email.indexOf('.', at)<1) {
			return false;
		}
		if(email.lastIndexOf('.')>email.length()-2) {
			return false;
		}
		for (int i = 0; i < email.length(); i++) {
			char c = email.charAt(i);
			if(!(Character.isDigit(c) || Character.isAlphabetic(c)||c=='-' || c=='_' || c=='.')) {
				return false;
			}
		}
		return true;
		
	}
*/	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + "]";
	}
	
	
}
