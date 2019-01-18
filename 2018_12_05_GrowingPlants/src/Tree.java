
public class Tree extends Plant {
	
	public Tree(String displayName, int age, int height) {
		super(displayName, age, height);
	}


	private static int GROW_PER_SEASON = 15;

	@Override
	public void doSummer() {
		 setHeight(getHeight() + getGrowPerSeason()	);

		
			display();
		
	}

	@Override
	public void doAutumn() {
		display();
		
	}


	@Override
	public int getGrowPerSeason() {
		return GROW_PER_SEASON;
	}

}
