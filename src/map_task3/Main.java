package map_task3;

import java.util.HashMap;
import java.util.Map;

public class Main {

	private static final Map<String, Integer> MAP = new HashMap<>();
	public static void main(String[] args) {
		MAP.put("str1",2);
		System.out.println(MAP);
		MAP.put("str2",1);
		System.out.println(MAP);
		try{
			tryPut("str1",2);
		}catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		tryPut("str1",5);
		System.out.println(MAP);
	}

	private static void tryPut(String key, int value) {
		if (MAP.containsKey(key) && MAP.get(key).equals(value)) {
			throw new IllegalArgumentException("Такой ключ и значение уже есть");
		}
		MAP.put(key, value);
	}
}
