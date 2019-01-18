package web.avtoPark.controller;

import web.avtoPark.data.*;

public class BusApp {

	public static void main(String[] args) {
		
		Route r1 = new Route(1, "Berlin", "Potsdam", 25);
		Route r2 = new Route(2, "Hamburg", "Cottbus", 423);
		Route r3 = new Route(3, "Leipzig", "Hamburg", 168);
		Route r4 = new Route(4, "Uzhgorod", "Lviv", 380);
		Route r5 = new Route(5, "Prag", "Vien", 120);
		Route r6 = new Route(6, "Parizh", "Munchen", 600);
		Route r7 = new Route(7, "Drezden", "Frankfurt", 550);
		Route r8 = new Route(8, "Kiev", "Mukachevo", 850);
		Route r9 = new Route(9, "Chernivci", "Warshava", 400);
		Route r10 = new Route(0, "Poznan", "Presov", 367);
		
		Bus b1 = new Bus(1, 24, r1);
		Bus b2 = new Bus(2, 34, r2);
		Bus b3 = new Bus(3, 55, r3);
		Bus b4 = new Bus(4, 12, r4);
		Bus b5 = new Bus(5, 22, r5);
		Bus b6 = new Bus(6, 65, r6);
		Bus b7 = new Bus(7, 47, r7);
		Bus b8 = new Bus(8, 41, r8);
		Bus b9 = new Bus(9, 24, r9);
		Bus b10 = new Bus(10, 33, r10);
		
		Route[] routes = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10};
		for (int i = 0; i < routes.length; i++) {
			//System.out.println(routes[i]);
		}
		
		
		Bus[] buses = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b10};
		for (int i = 0; i < buses.length; i++) {
			//System.out.println(buses[i]);
		}
		 
/*public boolean deleteBus(Bus bus) {
			for (int i = 0; i < buses.length; i++) {
				if(buses[i].equals(bus)) {
					buses[i]=buses[length-1];
					buses.length--;
					return true;
				}
			}
			return false;
		}
*/
	
/*	
		Trip t1 = new Trip(b1, r1);
		Trip t2 = new Trip(b1, r2);
*/		
		
		
	}

}
