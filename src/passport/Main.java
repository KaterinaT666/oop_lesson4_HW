package passport;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Passport> passports = new HashSet<>();
		passports.add(new Passport("1234", "Иван", "Иванов", "Иванович", LocalDate.now().minusYears(25)));
		passports.add(new Passport("1234", "Петр", "Петров", "Петрович", LocalDate.now().minusYears(24)));
		PassportList passportList = new PassportList(passports);
		System.out.println(passportList);
	}
}
