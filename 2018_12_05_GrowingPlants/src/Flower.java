
public class Flower extends Plant {
	
	public Flower(String displayName, int age, int height) {
		super(displayName, age, height);
	}


	private static int GROW_PER_SEASON = 5;
	
	

/*	public Flower(String displayName) {
		super(displayName, 0, 0);
	}
*/
	@Override
	public void doSummer() {
		 
	display();
	}

	@Override
	public void doAutumn() {
		setHeight(0);
		display();

	}


	@Override
	public int getGrowPerSeason() {
		return GROW_PER_SEASON;
	}

}
