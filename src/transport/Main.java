package transport;

import transport.driver.CategoryB;
import transport.driver.CategoryC;
import transport.driver.CategoryD;
import transport.driver.Driver;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Mechanic<PassengerCar> petr = new Mechanic<>
				("Петр","Петров", "Pirelli");
		Mechanic<Truck> sergey = new Mechanic<>("Сергей", "","");
		Mechanic<Bus> yuriy = new Mechanic<>("", "","");
		Sponsor lukoil = new Sponsor("Лукойл",2000000);
		Sponsor michelin = new Sponsor("Мишлен",1500000);

		CategoryB vasya = new CategoryB("Vasya", true, 10, "");
		CategoryC micha = new CategoryC("Micha", true, 13, "");
		CategoryD gricha = new CategoryD("Gricha", true, 6, "");

		Car toyota= new PassengerCar("Тойота",
				"Камри",
				1,
				TypeOfBody.SEDAN, vasya, petr);
		toyota.start();
		toyota.stop();
		toyota.pitStop();
		toyota.printType();
		toyota.addDriver(new CategoryB("Иван",true, 6, "B"));
		toyota.addSponsor(lukoil);

		Car nissan= new PassengerCar("Ниссан",
				"Жук",
				1,
				TypeOfBody.CROSSOVER, vasya);
		nissan.start();
		nissan.stop();
		nissan.pitStop();
		Car lexus= new PassengerCar("Лексус",
				"LX570",
				1,
				TypeOfBody.SEDAN, vasya);
		lexus.start();
		lexus.stop();
		lexus.pitStop();
		Car mazda= new PassengerCar("Мазда",
				"CX-5",
				1,
				TypeOfBody.HATCHBACK, vasya);
		mazda.start();
		mazda.stop();
		mazda.pitStop();

		Car ww= new Truck("Волькс Ваген",
				"Crafter",
				1,
				LoadCapasity.N1, micha);
		ww.start();
		ww.stop();
		ww.pitStop();
		ww.addDriver(new CategoryC("Анатолий",true, 10, "C"));
		Car volvo= new Truck("Вольво",
				"FH16",
				1,
				LoadCapasity.N3, micha);
		volvo.start();
		volvo.stop();
		volvo.pitStop();
		Car ford= new Truck("Форд",
				"F-MAX",
				1,
				LoadCapasity.N2, micha);
		ford.start();
		ford.stop();
		ford.pitStop();
		Car peugeot= new Truck("Пежо",
				"Boxer",
				1,
				LoadCapasity.N3, micha);
		peugeot.start();
		peugeot.stop();
		peugeot.pitStop();

		Car liaz= new Bus("ЛиАЗ",
				"677",
				1,
				Tonnage.EXTRA_SMALL, gricha);
		liaz.start();
		liaz.stop();
		liaz.pitStop();
		Car paz= new Bus("ПАЗ",
				"3205",
				1,
				Tonnage.EXTRA_LARGE, gricha);
		paz.start();
		paz.stop();
		paz.pitStop();
		Car maz= new Bus("МАЗ",
				"216",
				1,
				Tonnage.MEDIUM, gricha);
		maz.start();
		maz.stop();
		maz.pitStop();
		maz.printType();
		Car nefaz= new Bus("НеФАЗ",
				"5299",
				1,
				Tonnage.LARGE,gricha);
		nefaz.start();
		nefaz.stop();
		nefaz.pitStop();
		nefaz.addDriver(new CategoryD("Наталья",true, 8, "D"));


		List<Car> cars = List.of(
				toyota, ww, nefaz);
		for (Car car : cars){
			printInfoSponsor(car);
		}

		Driver<PassengerCar> Ivan = new CategoryB("Иван",true, 6, "B");
		Driver<Bus> Natalia = new CategoryD("Наталья",true, 8, "D");
		Driver<Truck> Anatoliy = new CategoryC("Анатолий",true, 10, "C");

		Ivan.start((PassengerCar) toyota);
		Ivan.stop((PassengerCar)toyota);
		Ivan.printInfo((PassengerCar)toyota);


		System.out.println("+++++++++++");
		ServiceStation serviceStation = new ServiceStation();
		serviceStation.addPassengerCar((PassengerCar) toyota);
		serviceStation.addTruck((Truck) ford);
		serviceStation.serviceCar();
		serviceStation.serviceCar();
		System.out.println("+++++++++++");

		passDiagnostics(toyota, nissan, lexus, mazda,
				ww, volvo, ford, peugeot,
				liaz, paz, maz);
	}

	public static void printInfoSponsor(Car car){
		System.out.println("Информация об автомобиле: " + car.getBrand() + " " + car.getModel() );
		System.out.println("Водители: " + car.getDrivers());

		System.out.println("Спонсоры: " + car.getSponsors());

	}
	private static void passDiagnostics(Car... cars){
		for (Car car : cars) {
			passDiagnosticsCar (car);
		}
	}

	private static void passDiagnosticsCar (Car car) {
		try {
			if (!car.passDiagnostics()) {
				throw new RuntimeException("Автомобиль" + car.getBrand() +
						car.getModel() + " не прошел диагностику.");
			}
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}