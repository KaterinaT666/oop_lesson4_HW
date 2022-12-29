package transport.driver;

import transport.Truck;

public class CategoryC extends Driver<Truck> {

	public CategoryC(String name,
					 boolean license,
					 int experience,
					 String typeOfRights) {
		super(name, license, experience, typeOfRights);
	}

	@Override
	public void start(Truck Car) {

	}

	@Override
	public void stop(Truck Car) {

	}

	@Override
	public void refuel(Truck Car) {
		System.out.println("Водитель " +getName()+
				", заправляет грузовик "+ Car.getBrand());
	}
	@Override
	public String toString() {
		return "C";
	}
}
