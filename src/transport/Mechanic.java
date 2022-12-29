package transport;

import java.util.Objects;

public class Mechanic<T extends Car>{

	private final String name;
	private final String surname;
	private final String company;

	public Mechanic(String name, String surname, String company) {
		this.name = name;
		this.surname = surname;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getCompany() {
		return company;
	}

	public boolean service (T t){
		return t.passDiagnostics();
	}
	public void repair(T t){
		t.repair();
	}

	@Override
	public String toString() {
		return  "Механик: " + name + " " +  surname + "из \"" + company + "\"" ;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Mechanic<?> mechanic = (Mechanic<?>) o;
		return Objects.equals(getName(), mechanic.getName()) && Objects.equals(getSurname(), mechanic.getSurname()) && Objects.equals(getCompany(), mechanic.getCompany());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getSurname(), getCompany());
	}
}
