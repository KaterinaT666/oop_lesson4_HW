package transport;

import transport.driver.CategoryB;
import transport.driver.CategoryC;
import transport.driver.CategoryD;
import transport.driver.Driver;

public class Main {
	public static void main(String[] args) {

		Car toyota= new PassengerCar("Тойота",
				"Камри",
				1,
				TypeOfBody.SEDAN);
		toyota.start();
		toyota.stop();
		toyota.pitStop();
		toyota.printType();
		Car nissan= new PassengerCar("Ниссан",
				"Жук",
				1,
				TypeOfBody.CROSSOVER);
		nissan.start();
		nissan.stop();
		nissan.pitStop();
		Car lexus= new PassengerCar("Лексус",
				"LX570",
				1,
				TypeOfBody.SEDAN);
		lexus.start();
		lexus.stop();
		lexus.pitStop();
		Car mazda= new PassengerCar("Мазда",
				"CX-5",
				1,
				TypeOfBody.HATCHBACK);
		mazda.start();
		mazda.stop();
		mazda.pitStop();

		Car ww= new Truck("Волькс Ваген",
				"Crafter",
				1,
				LoadCapasity.N1);
		ww.start();
		ww.stop();
		ww.pitStop();
		Car volvo= new Truck("Вольво",
				"FH16",
				1,
				LoadCapasity.N3);
		volvo.start();
		volvo.stop();
		volvo.pitStop();
		Car ford= new Truck("Форд",
				"F-MAX",
				1,
				LoadCapasity.N2);
		ford.start();
		ford.stop();
		ford.pitStop();
		Car peugeot= new Truck("Пежо",
				"Boxer",
				1,
				LoadCapasity.N3);
		peugeot.start();
		peugeot.stop();
		peugeot.pitStop();

		Car liaz= new Bus("ЛиАЗ",
				"677",
				1,
				Tonnage.EXTRA_SMALL);
		liaz.start();
		liaz.stop();
		liaz.pitStop();
		Car paz= new Bus("ПАЗ",
				"3205",
				1,
				Tonnage.EXTRA_LARGE);
		paz.start();
		paz.stop();
		paz.pitStop();
		Car maz= new Bus("МАЗ",
				"216",
				1,
				Tonnage.MEDIUM);
		maz.start();
		maz.stop();
		maz.pitStop();
		maz.printType();
		Car nefaz= new Bus("НеФАЗ",
				"5299",
				1,
				Tonnage.LARGE);
		nefaz.start();
		nefaz.stop();
		nefaz.pitStop();

		Driver<PassengerCar> Ivan = new CategoryB("Иван",true, 6);
		Driver<Bus> Natalia = new CategoryD("Наталья",true, 8);
		Driver<Truck> Anatoliy = new CategoryC("Анатолий",true, 10);

		Ivan.start((PassengerCar) toyota);
		Ivan.stop((PassengerCar)toyota);
		Ivan.printInfo((PassengerCar)toyota);

		Natalia.refuel((Bus)maz);
		Natalia.printInfo((Bus)maz);
	}
}