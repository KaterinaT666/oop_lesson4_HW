package transport;
public class Truck extends Car implements Competing {

	private LoadCapasity loadCapasity;
	public Truck(String brand,
				 String model,
				 int engineCapacity,
				 LoadCapasity loadCapasity) {
		super(brand, model, engineCapacity);
		this.loadCapasity = loadCapasity;
	}

	public LoadCapasity getLoadCapasity() {
		return loadCapasity;
	}

	public void setLoadCapasity(LoadCapasity loadCapasity) {
		this.loadCapasity = loadCapasity;
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
