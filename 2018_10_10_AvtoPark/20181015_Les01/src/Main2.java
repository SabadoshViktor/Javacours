
public class Main2 {

	public static void main(String[] args) {
		Bus bus1 = new Bus("B01", 40, new Route(51, "Potsdam", "Hamburg", 340));
		Bus bus2 = new Bus("B02", 30, new Route(52, "Potsdam", "Hamburg", 340));
		Bus bus3 = new Bus("B03", 20, new Route(53, "Potsdam", "Hamburg", 340));
		Bus bus4 = new Bus("B04", 10, new Route(54, "Potsdam", "Hamburg", 340));

		AutoPark autoPark = new AutoPark(10);

		autoPark.add(bus1);
		autoPark.add(bus2);
		autoPark.add(bus3);
		autoPark.add(bus4);
		autoPark.add(new Bus("B05", 60, new Route(55, "Berlin", "Bremen", 300)));

		autoPark.print();

	}

}
