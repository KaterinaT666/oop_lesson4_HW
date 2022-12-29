package transport.driver;

import transport.Bus;

public class CategoryD extends Driver<Bus> {

	public CategoryD(String name,
				 boolean license,
					 int experience,
					 String typeOfRights) {
		super(name, license, experience, typeOfRights);
	}

	@Override
	public void start(Bus Car) {

	}

	@Override
	public void stop(Bus Car) {

	}

	@Override
	public void refuel(Bus Car) {
	System.out.println
			("Водитель " +getName()+", заправляет автобус "+ Car.getBrand());
	}
	@Override
	public String toString() {
		return "D";
	}
}
