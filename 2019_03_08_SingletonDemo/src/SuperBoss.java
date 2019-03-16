	
public class SuperBoss {
	
//	private static SuperBoss INSTANCE = new SuperBoss("SUPER BOSS");
	private static SuperBoss INSTANCE;
	
	String name;

	private SuperBoss(String name) {
		this.name = name;
	}
	
	public static SuperBoss getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SuperBoss("SUPER BOSS");
	}
		return INSTANCE;
	}		
	
	
	
}
