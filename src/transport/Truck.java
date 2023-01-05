package transport;
import transport.driver.CategoryC;

import java.util.*;

public class Truck extends Car implements Competing {

	private LoadCapasity loadCapasity;
	private CategoryC driver;
	private Set<Mechanic<Truck>> mechanics;
	public Truck(String brand,
				 String model,
				 int engineCapacity,
				 LoadCapasity loadCapasity,
				 CategoryC driver,
				 Mechanic<Truck>... mechanics) {
		super(brand, model, engineCapacity);
		this.loadCapasity = loadCapasity;
		this.mechanics = new HashSet<>(Arrays.asList(mechanics));
		setDriver(driver);
	}

	public void setDriver(CategoryC driver) {
		this.driver = driver;
	}

	public LoadCapasity getLoadCapacity() {
		return loadCapasity;
	}

	public void setLoadCapacity(LoadCapasity loadCapasity) {
		this.loadCapasity = loadCapasity;
	}

	@Override
	public Set<?> mechanics() {
		return mechanics();
	}

	public void start(){
		System.out.println("Грузовик \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Грузовик \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
	}

	@Override
	public void printType() {
		if (loadCapasity == null){
			System.out.println("Данных по авто не достаточно");
		}else{
			String from = loadCapasity.getFrom() == 0D? "" : "от " + loadCapasity.getFrom();
			String to = loadCapasity.getTo() == 0D? "" : " до " + loadCapasity.getTo();
			System.out.println("Грузоподьемность: " + from + to);
		}
	}

	@Override
	public boolean passDiagnostics() {
		System.out.println("Грузовик " + getBrand() + getModel() + ", прошел диагностику.");
		return true;
	}

	@Override
	public void repair() {
		System.out.println("Грузовик " + getBrand() + getModel() + " отремонтирован.");
	}

	@Override
	public void pitStop() {
		System.out.println("Грузовик прошел пит-стоп");
	}

	@Override
	public int bestLoopTime() {
		return (int) (Math.random()*12);
	}

	@Override
	public int maxSpeed() {
		return (int) (Math.random()*120);
	}
	@Override
	public String toString() {
		return "Грузовик с водителем: " + driver + "\n" + super.toString();
	}

}
