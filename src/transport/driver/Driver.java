package transport.driver;

import transport.Car;

public abstract class Driver <T extends Car>{
	private String name;
	private boolean license;
	private int  experience;

	public Driver(String name,
				  boolean license,
				  int experience) {
		this.name = name;
		this.license = license;
		this.experience = experience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isLicense() {
		return license;
	}

	public void setLicense(boolean license) {
		this.license = license;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public abstract void start(T Car);
	public abstract void stop(T Car);
	public abstract void refuel(T Car);


	public void printInfo(T car){
		System.out.println("Водитель " + name + " управляет автомобилем "
				+ car.getBrand()+" и будет участвовать в заезде.");
	}

}
