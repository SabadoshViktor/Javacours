package web.avtoPark.data;

public class Trip {
	
	private Bus bus;
	private Route route;
	public Trip(Bus bus, Route route) {
		super();
		this.bus = bus;
		this.route = route;
	}
	
	@Override
	public String toString() {
		return "Trip [bus=" + bus + ", route=" + route + "]";
	}

}
