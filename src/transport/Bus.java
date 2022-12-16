package transport;
public class Bus extends Car implements Competing {
	private Tonnage tonnage;
	public Bus(String brand,
			   String model,
			   int engineCapacity,
			   Tonnage tonnage) {
		super(brand, model, engineCapacity);
		this.tonnage = tonnage;
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
