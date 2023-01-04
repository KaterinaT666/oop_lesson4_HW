package transport.driver;

import transport.Car;

import java.util.Objects;

public abstract class Driver <T extends Car>{
	private String name;
	private boolean license;
	private int  experience;
	private String typeOfRights;

	public Driver(String name,
				  boolean license,
				  int experience,
				  String typeOfRights) {
		this.name = name;
		this.license = license;
		this.experience = experience;
		setTypeOfRights(typeOfRights);
	}

	public String getTypeOfRights() {
		return typeOfRights;
	}

	public void setTypeOfRights(String typeOfRights) {
		if (typeOfRights == null || typeOfRights.isEmpty()){
			throw new RuntimeException(" Необходимо указать тип прав");
		}else {
			this.typeOfRights = typeOfRights;
		}
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

	public void printInfoOfLicense(T car) {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Driver<?> driver = (Driver<?>) o;
		return isLicense() == driver.isLicense()
				&& getName().equals(driver.getName())
				&& getTypeOfRights().equals(driver.getTypeOfRights());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), isLicense(), getTypeOfRights());
	}

	@Override
	public String toString() {
		return "Driver{" +
				"name='" + name + '\'' +
				", license=" + license +
				", experience=" + experience +
				", typeOfRights='" + typeOfRights + '\'' +
				'}';
	}
}
