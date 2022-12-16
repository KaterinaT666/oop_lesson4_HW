package transport.driver;

import transport.PassengerCar;

public class CategoryB extends Driver<PassengerCar> {

	public CategoryB(String name,
					 boolean license,
					 int experience) {
		super(name, license, experience);
	}

	@Override
	public void start(PassengerCar Car ) {

	}

	@Override
	public void stop(PassengerCar Car) {

	}

	@Override
	public void refuel(PassengerCar Car) {
		System.out.println("Водитель " +getName()+", заправляет автомобиль "+ Car.getBrand());
	}

}
