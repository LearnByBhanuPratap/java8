package biConsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample4 {

	static BiConsumer<Integer, String> mapConsumer = (k, v) -> {
		System.out.print(k+ " ");
		System.out.println(v);
	};

	public static void main(String args[]) {
		Map<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Go");
        map.put(3, "C");
        map.put(4, "JavaScript");
        map.put(5, "C++");
        map.forEach(mapConsumer);
	}
}