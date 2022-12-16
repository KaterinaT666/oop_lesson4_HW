package transport;

import transport.Car;
import transport.Competing;

public class PassengerCar extends Car implements Competing {

	public PassengerCar(String brand,
						String model,
						int engineCapacity) {
		super(brand, model, engineCapacity);
	}
	public void start(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
	}

	@Override
	public void pitStop() {
		System.out.println("Автомобиль прошел пит-стоп");
	}
	@Override
	public int bestLoopTime() {
		return (int) (Math.random()*7);
	}
	@Override
	public int maxSpeed() {
		return (int) (Math.random()*150);
	}
}
