package transport;

import transport.driver.CategoryB;
import transport.driver.CategoryC;
import transport.driver.CategoryD;
import transport.driver.Driver;

public class Main {
	public static void main(String[] args) {

		Car toyota= new PassengerCar("Тойота",
				"Камри",
				1);
		toyota.start();
		toyota.stop();
		toyota.pitStop();
		Car nissan= new PassengerCar("Ниссан",
				"Жук",
				1);
		nissan.start();
		nissan.stop();
		nissan.pitStop();
		Car lexus= new PassengerCar("Лексус",
				"LX570",
				1);
		lexus.start();
		lexus.stop();
		lexus.pitStop();
		Car mazda= new PassengerCar("Мазда",
				"CX-5",
				1);
		mazda.start();
		mazda.stop();
		mazda.pitStop();

		Car ww= new Truck("Волькс Ваген",
				"Crafter",
				1);
		ww.start();
		ww.stop();
		ww.pitStop();
		Car volvo= new Truck("Вольво",
				"FH16",
				1);
		volvo.start();
		volvo.stop();
		volvo.pitStop();
		Car ford= new Truck("Форд",
				"F-MAX",
				1);
		ford.start();
		ford.stop();
		ford.pitStop();
		Car peugeot= new Truck("Пежо",
				"Boxer",
				1);
		peugeot.start();
		peugeot.stop();
		peugeot.pitStop();

		Car liaz= new Bus("ЛиАЗ",
				"677",
				1);
		liaz.start();
		liaz.stop();
		liaz.pitStop();
		Car paz= new Bus("ПАЗ",
				"3205",
				1);
		paz.start();
		paz.stop();
		paz.pitStop();
		Car maz= new Bus("МАЗ",
				"216",
				1);
		maz.start();
		maz.stop();
		maz.pitStop();
		Car nefaz= new Bus("НеФАЗ",
				"5299",
				1);
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