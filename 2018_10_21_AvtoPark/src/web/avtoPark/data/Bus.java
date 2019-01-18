package web.avtoPark.data;

public class Bus {
	
	private int number;
	private int size;
	private Route route;
	public Bus(int number, int size, Route route) {
		super();
		this.number = number;
		this.size = size;
		this.route = route;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public Route getRoute() {
		return route;
	}
	public void setRoute(Route route) {
		this.route = route;
	}
	@Override
	public String toString() {
		return "Bus:  number - " + number + ", size - " + size + ", " + route + " ";
	}
	
	


	
	
	

}
