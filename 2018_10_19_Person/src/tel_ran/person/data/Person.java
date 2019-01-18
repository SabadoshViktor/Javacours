package tel_ran.person.data;

public class Person {
	
	private int taxID;
	private String name;
	private String surName;
	private int age;
	private boolean sex;
	
	public Person() {
		System.out.println("Shalom Constructor");
	}
	
	public Person(int taxID, String name, String surName, int age, boolean sex) {
		System.out.println("Shalom Construcnor 2");
		setTaxID(taxID);
		setName(name);
		setSurName(surName);
		setAge(age);
		setSex(sex);
	}
	
	
	
	
	
	public int getTaxID() {
		return taxID;
	}
	public String getName() {
		return name;
	}
	public String getSurName() {
		return surName;
	}
	public int getAge() {
		return age;
	}
	public String getSex() {
		if(sex) {
			return "Male";
		}
		else {
			return "Female";
		}
	}
	
	public void setTaxID(int taxID) {
		this.taxID=taxID;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSurName(String surName) {
		this.surName=surName;
	}
	public void setAge(int age) {
		this.age=age;
	}

	public void setSex(boolean sex) {
		this.sex=sex;
	}
	
	
	public void display() {
		System.out.println("ID: "+taxID);
		System.out.println("Name is: "+name);
		System.out.println("Surname is: "+surName);
		System.out.println("Age is: "+age);
		System.out.println("Gender: "+getSex());  // ми покликали метод який покаже 
	}
	
	public void display(String greeting, int number) {
		System.out.println(greeting+" "+name+" "+number);
	}
	
	
	
	
	

}
