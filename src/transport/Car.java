package transport;

import transport.driver.Driver;

import java.util.*;

public abstract class Car implements Competing {

	private String brand;
	private String model;
	private int engineCapacity;
	private Set<Driver<?>> drivers;
	private final Set<Sponsor> sponsors;

	public Car(String brand, String model, int engineCapacity) {
		setBrand(brand);
		setModel(model);
		setEngineCapacity(engineCapacity);
		this.sponsors = new HashSet<>();
		this.drivers = new HashSet<>();
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		if (brand == null || brand.isEmpty()){
			brand = "defalt";
		}
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		if (model == null || model.isEmpty()){
			model = "defalt";
		}
		this.model = model;
	}
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		List<Sponsor> sponsorList = new ArrayList<>(sponsors);
		if (!sponsorList.isEmpty()) {
			result.append("Спонсоры: ");
		}
			for (int i = 0; i< sponsorList.size(); i++){
				result.append(sponsorList.get(i));
				if (i != sponsorList.size() - 1){
					result.append(", ");
				}
			}
			return result.toString();
	}

	public Set<Driver<?>> getDrivers() {
		return drivers;
	}

	public Set<Sponsor> getSponsors() {
		return sponsors;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		if (engineCapacity < 0){
			engineCapacity = 1;
		}
		this.engineCapacity = engineCapacity;
	}
	public void addDriver (Driver<?>... drivers){

		this.drivers.addAll(Arrays.asList(drivers));
	}
	public String driversInfo(){
		List<?> drivers = new ArrayList<>(getDrivers());
		StringBuilder result = new StringBuilder();
		if (!drivers.isEmpty()){
			result.append("Водитель: ");
		}
		for (int i = 0; i< drivers.size(); i++){
			result.append(drivers.get(i));
			if (i != drivers.size() - 1){
				result.append(", ");
			}
		}
		return result.append("\n").append(driversInfo()).toString();
	}
	public void addSponsor (Sponsor sponsor){
		sponsors.add(sponsor);
	}
	public abstract Set<?> mechanics();
	public String mechanicsInfo(){
		List<?> mechanics = new ArrayList<>(mechanics());
		StringBuilder result = new StringBuilder();
		if (!mechanics.isEmpty()){
			result.append("Механики: ");
		}
		for (int i = 0; i< mechanics.size(); i++){
			result.append(mechanics.get(i));
			if (i != mechanics.size() - 1){
				result.append(", ");
			}
		}
		return result.append("\n").append(mechanicsInfo()).toString();
	}

	public abstract void start();
	public abstract void stop();
	public abstract void printType();
	public abstract boolean passDiagnostics();
	public abstract void repair();
}
