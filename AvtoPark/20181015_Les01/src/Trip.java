
public class Trip {
	private Bus bus;
	private Route route;

	public Trip(Bus bus, Route route) {
		this.bus = bus;
		this.route = route;
	}

	@Override
	public String toString() {
		return "Trip [bus=" + bus + ", route=" + route + "]";
	}

	public static void main(String[] args) {
		Bus bus1 = new Bus("B01", 40);
		Route route1 = new Route(1, "Berlin", "Hamburg", 300);
		Route route2 = new Route(2, "Berlin", "Potsdam", 30);

		Trip t1 = new Trip(bus1, route1);
		Trip t2 = new Trip(bus1, route2);

		System.out.println(t1);
		System.out.println(t2);
	}

}
