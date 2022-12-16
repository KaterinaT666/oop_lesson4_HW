package transport;

public class Bus extends Car implements Competing {
	public Bus(String brand,
			   String model,
			   int engineCapacity) {
		super(brand, model, engineCapacity);
	}
	public void start(){
		System.out.println("Автобус \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Автобус \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
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

}
