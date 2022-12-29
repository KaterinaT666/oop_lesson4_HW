package HW_HC;
import java.util.*;


class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> numbers = new HashSet<>();
		while (numbers.size() < 20) {
			numbers.add(random.nextInt());
		}
		System.out.println(numbers);

		//numbers.removeIf(numbers -> number %2 == 1);


		Iterator<Integer> Iterator = numbers.iterator();
		while(Iterator.hasNext()) {
			Integer number = Iterator.next();
			if (number % 2 == 1) {
				Iterator.remove();
			}
		}
		System.out.println(numbers);
	}
}

