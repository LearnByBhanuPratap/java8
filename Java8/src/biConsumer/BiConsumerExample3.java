package biConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample3 {

	static Map<Integer, String> newMap = new HashMap<Integer, String>();

	static BiConsumer<Map<Integer, String>, Map<Integer, String>> mapConsumer = (map1, map2) -> {
		for (Map.Entry<Integer, String> map : map1.entrySet()) {
			map2.put(map.getKey() * 3, map.getValue());
		}
	};

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Java");
		map.put(2, "Go");
		map.put(3, "C");
		map.put(4, "JavaScript");
		map.put(5, "C++");

		mapConsumer.accept(map, newMap);

		System.out.println(newMap);
	}
}