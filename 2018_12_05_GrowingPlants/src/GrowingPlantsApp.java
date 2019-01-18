
public class GrowingPlantsApp {

	public static void main(String[] args) {

		Plant p1 = new Flower("Rose", 2, 25);
		Plant p2 = new Flower("Kanabis", 1, 15);
		
		Plant p3 = new Tree("Dub" , 15, 10);
		Plant p4 = new Tree("Kashtan", 1, 25);
		
		
		Plant [ ] plants = {p1, p2, p3, p4};
		growPlants(plants, 5);
		

	}
	public static void growPlants(Plant [] plants, int age) {
		for (int i = 0; i < 4; i++) {
			for(Plant p: plants) {
				p.growOneYear();
			p.display();
			}
			

}
}

}
