package transport;

import java.util.Objects;

public class Sponsor {

	private final String name;
	private final int amount;

	public Sponsor(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}
	public void toSponsorRace (){

		System.out.printf ("Спонсор \"%s\" проспонсировал заезд на %d%n" + name, amount);
	}

	@Override
	public String toString() {
		return  "Спонсор " + name + ", сумма поддержки: " + amount;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Sponsor sponsor = (Sponsor) o;
		return getAmount() == sponsor.getAmount() && Objects.equals(getName(), sponsor.getName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getName(), getAmount());
	}
}
