package transport;

import transport.driver.CategoryB;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PassengerCar extends Car implements Competing {

	private TypeOfBody typeOfBody;
	private CategoryB driver;
	private final Set<Mechanic<PassengerCar>> mechanics;

	public PassengerCar(String brand,
						String model,
						int engineCapacity,
						TypeOfBody typeOfBody,
						CategoryB driver,
						Mechanic<PassengerCar>... mechanics) {
		super(brand, model, engineCapacity);
		this.typeOfBody = typeOfBody;
		this.mechanics = new HashSet<>(Arrays.asList(mechanics));
		setDriver(driver);
	}

	public void setDriver(CategoryB driver) {
		this.driver = driver;
	}

	public TypeOfBody getTypeOfBody() {
		return typeOfBody;
	}

	public void setTypeOfBody(TypeOfBody typeOfBody) {
		this.typeOfBody = typeOfBody;
	}

	@Override
	public Set<?> mechanics(){
		return mechanics;
	}

	public void start(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
	}

	@Override
	public void printType() {
		if (typeOfBody == null){
			System.out.println("Данных по авто не достаточно");
		}else{
			System.out.println("Тип кузова авто: " + getTypeOfBody());
		}
	}

	@Override
	public boolean passDiagnostics() {
		System.out.println("Авто " + getBrand() + getModel() + ", прошел диагностику.");
		return true;
	}

	@Override
	public void repair() {
		System.out.println("Машина " + getBrand() + getModel() + " отремонтирована.");
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
	@Override
	public String toString() {
		return "Автомобиль с водителем: " + driver + "\n" + super.toString();
	}

}
