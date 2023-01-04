package telephone_directory;

import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {

	private final Map<String, String> directory = new HashMap<>();
	public void add(String name, String telephone){
		directory.put(name, telephone);
	}

	public void print(){
		for (Map.Entry<String, String> entry: directory.entrySet()) {
			System.out.println("Контакт " + entry.getKey() + ": " + entry.getValue());
		}

	}
}
