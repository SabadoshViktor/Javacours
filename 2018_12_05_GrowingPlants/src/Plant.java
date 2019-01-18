
public abstract class Plant {
	
	private String displayName;
	private int age;
	private int height;
	
	public abstract void doSummer();
	public abstract void doAutumn();
	
	public Plant(String displayName, int age, int height) {
		this.displayName = displayName;
		this.age = age;
		this.height = height;
	}
	
	public  void doSpring() {
		 setHeight(getHeight() + getGrowPerSeason()	);
		 
	}
	
	public   void doWinter() {
		 setHeight(getHeight() + getGrowPerSeason()	);
 
		//System.out.println(getDisplayName() + "height"+getHeight());

	}
/*	public int getRealAge() {
		return a;
	}
*/	
	public void display() {
		System.out.println("Name is : " +getDisplayName() + " Age is: "+ getAge() + " height "+getHeight());
	}
	
	public void growOneYear() {
		doSpring();
		doSummer();
		doAutumn();
		doWinter();
		oneYearToAge();
		System.out.println("***********************************************************");
		}
	
	public abstract int getGrowPerSeason();
	
	public void oneYearToAge() {
		this.age++;
	}

	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	
	

}
