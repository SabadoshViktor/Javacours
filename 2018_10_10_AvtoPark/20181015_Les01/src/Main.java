// [][][][][][0x100][][][][][][][][ auto  "BMW", "black", 4.0, 2018, false    ] [][][]  [0x100]   [][][][][]
//           auto1              0x100                                                   auto2

//           arr[0]   arr[1]      arr[2]
//[][][][][] []       []          []             [][][[][][][][][][][][][]
// int[3] arr;

// BUS   {1,2,3,4} =10
// ROUTE {2,1,0,4} =7 => 10-7=3

public class Main {


	public static void main(String[] args) {


		Route route1 = new Route(1,"Berlin","Hamburg",300);
		Route route2 = new Route(2, "Berlin", "Potsdam", 30);
		Bus bus1 = new Bus("B01", 30, route1);
		Bus bus2 = new Bus("B02", 20, new Route(55, "Potsdam", "Hamburg", 340));
		
		bus1.setRoute(route2);

		Bus[] buses = { bus1, bus2, new Bus("B03", 30, new Route(4, "Berlin", "Paris", 1700)),
				new Bus("B04", 30, new Route(5, "Berlin", "Miland", 1200)),
				new Bus("B05", 10, new Route(4, "Berlin", "Paris", 1700)) };



		for (int i = 0; i < buses.length; i++) {
			System.out.println(buses[i]);
		}


		// Buble Sort buses by route number

		boolean flag = false;
		do {
			flag = false;
			for (int j = 0; j < buses.length - 1; j++) {
				if (buses[j].getRoute().getNumber() > buses[j + 1].getRoute().getNumber()) {
					Bus temp = buses[j];
					buses[j] = buses[j + 1];
					buses[j + 1] = temp;
					flag = true;

				}
			}
		} while (flag);

		System.out.println("------------------sorted buses -----------------------------------");
		for (int i = 0; i < buses.length; i++) {
			System.out.println(buses[i]);
		}

		// Compare two arrays and find wrong cell

		int[] routers = { 2, 0, 4, 5, 4 };
		flag = true;

		for (int i = 0; flag && i < buses.length; i++) {
			int curRoute = buses[i].getRoute().getNumber();
			flag = false;

			for (int j = 0; !flag && j < routers.length; j++) {
				flag = (curRoute == routers[j]); // if (curRoute == routers[j]) flag = true else flag = false;
			}
			if (!flag)
				// "flag == false" means that we have found
				System.out.println("-------------------------------------------");
				System.out.println(buses[i]);


		}

	}

}

