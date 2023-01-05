package transport;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStation <T extends Car> {

	private final Queue<Car> cars = new ArrayDeque<>();

	private void add(Car car){
		cars.offer(car);
	}
	public void addPassengerCar(PassengerCar PassengerCar){
		add(PassengerCar);
	}
	public void addTruck(Truck Truck){
		add(Truck);
	}
	public void serviceCar(){
		if (!cars.isEmpty()) {
			Car car = cars.poll();
			boolean result = car.passDiagnostics();
			if (!result){
				car.passDiagnostics();
			}
		}
	}

}
