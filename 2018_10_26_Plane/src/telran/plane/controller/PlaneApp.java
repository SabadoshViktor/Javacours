package telran.plane.controller;

import telran.plane.data.*;

import telran.plane.data.DeltaPlane;
import telran.plane.data.Plane;

public class PlaneApp {

	public static void main(String[] args) {
		
		Plane p1 = new Plane(50, 50, 150, "Boeing", "747", 12);
		System.out.println(p1);
		
		System.out.println(p1.calculateTrip(8));
		
		Plane[] planes = {p1,new Plane(60, 60, 600, "Antonow", "Mria", 30) };
		
		boolean res1 = p1.equals(planes[1]);
		System.out.println(res1);
		
		DeltaPlane d1 = new DeltaPlane(7, 20, 2, "HandMade", "v1", 0, 20, "White");
		System.out.println(d1);
		
		boolean res2 = d1.equals(p1);
		System.out.println(res2);

	}

}
