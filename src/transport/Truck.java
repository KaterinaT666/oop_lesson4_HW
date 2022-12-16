package transport;

public class Truck extends Car implements Competing {
	public Truck(String brand, String model, int engineCapacity) {
		super(brand, model, engineCapacity);
	}

	public void start(){
		System.out.println("Грузовик \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Грузовик \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
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
}
