package transport;
public class PassengerCar extends Car implements Competing {

	private TypeOfBody typeOfBody;

	public PassengerCar(String brand,
						String model,
						int engineCapacity,
						TypeOfBody typeOfBody) {
		super(brand, model, engineCapacity);
		this.typeOfBody = typeOfBody;
	}

	public TypeOfBody getTypeOfBody() {
		return typeOfBody;
	}

	public void setTypeOfBody(TypeOfBody typeOfBody) {
		this.typeOfBody = typeOfBody;
	}

	public void start(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") начал движение");
	}
	public void stop(){
		System.out.println("Автомобиль \"" + getBrand() + "\" (\"" +getModel() + "\") закончил движение");
	}

	@Override
	public void printType() {
		if (typeOfBody == null){
			System.out.println("Данных по авто не достаточно");
		}else{
			System.out.println("Тип кузова авто: " + getTypeOfBody());
		}
	}

	@Override
	public void pitStop() {
		System.out.println("Автомобиль прошел пит-стоп");
	}
	@Override
	public int bestLoopTime() {
		return (int) (Math.random()*7);
	}
	@Override
	public int maxSpeed() {
		return (int) (Math.random()*150);
	}
}
