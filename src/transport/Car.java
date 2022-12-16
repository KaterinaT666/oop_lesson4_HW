package transport;
public abstract class Car implements Competing {

	private String brand;
	private String model;
	private int engineCapacity;

	public Car(String brand, String model, int engineCapacity) {
		setBrand(brand);
		setModel(model);
		setEngineCapacity(engineCapacity);
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

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		if (engineCapacity < 0){
			engineCapacity = 1;
		}
		this.engineCapacity = engineCapacity;
	}
	public abstract void start();
	public abstract void stop();
	public abstract void printType();
}
