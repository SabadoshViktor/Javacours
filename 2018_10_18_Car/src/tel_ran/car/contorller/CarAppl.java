package tel_ran.car.contorller;

import tel_ran.car.data.Car;

public class CarAppl {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setName("Audi");
		car1.setModel("A7");
		car1.setWin(256887558);
		car1.setColor("Black");
		car1.setSize(5);
		car1.setWeight(1.8);
		car1.setMotor(3.5);
		car1.setFuel("DIESEL");
		car1.setPower(470);
		car1.setYear(2017);
		
		car1.display();


	}

}
