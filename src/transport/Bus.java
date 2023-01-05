package transport;

import transport.driver.CategoryD;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bus extends Car implements Competing {
	private Tonnage tonnage;
	private CategoryD driver;
	private Set<Mechanic<Bus>> mechanics;
	public Bus(String brand,
			   String model,
			   int engineCapacity,
			   Tonnage tonnage,
			   CategoryD driver,
			   Mechanic<Bus>... mechanics) {
		super(brand, model, engineCapacity);
		this.tonnage = tonnage;
		this.mechanics = new HashSet<>(Arrays.asList(mechanics));
		setDriver(driver);
	}

	public void setDriver(CategoryD driver) {
		this.driver = driver;
	}

	public Set<Mechanic<Bus>> getMechanics() {
		return mechanics;
	}

	public Tonnage getTonnage() {
		return tonnage;
	}

	public void setTonnage(Tonnage tonnage) {
		this.tonnage = tonnage;
	}

	public void start(){
		System.out.println("Автобус \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Автобус \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
	}

	@Override
	public void printType() {
		if (tonnage == null){
			System.out.println("Данных по авто не достаточно");
		}else{
			String from = tonnage.getFrom() == 0D? "" : "от " + tonnage.getFrom();
			String to = tonnage.getTo() == 0D? "" : " до " + tonnage.getTo();
			System.out.println("Вместимость: " + from + to);
		}
	}

	@Override
	public boolean passDiagnostics() {
		System.out.println("Автобус" + getBrand() + getModel() + ", в диагностике не нуждается.");
		return true;
	}

	@Override
	public void repair() {
		System.out.println("Автобус " + getBrand() + getModel() + " отремонтирован.");
	}

	@Override
	public void pitStop() {
		System.out.println("Автобус прошел пит-стоп");
	}

	@Override
	public int bestLoopTime() {
		return (int) (Math.random()*15);
	}

	@Override
	public int maxSpeed() {
		return (int) (Math.random()*100);
	}
	public Set<?> mechanics(){
		return getMechanics();
	}

	@Override
	public String toString() {
		return "Автобус с водителем: " + driver + "\n" + super.toString();
	}
}
