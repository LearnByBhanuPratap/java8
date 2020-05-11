package consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerAndThen3 {
	
	static Consumer<Map<Integer, String>> updatePersons = Show::updateData;

	static Consumer<Map<Integer, String>> displayPersons = Show::displayData;

	public static void main(String[] args) {
		
		Map<Integer, String> persons = new HashMap<Integer, String>();
		persons.put(100, "Ram");
		persons.put(101, "Mohan");

		updatePersons.andThen(displayPersons).accept(persons);
	}
}

class Show {
	static void updateData(Map<Integer, String> persons) {
		persons.replaceAll((k, v) -> "Mr ".concat(v));
	}

	static void displayData(Map<Integer, String> persons) {
		for (Map.Entry<Integer, String> entry : persons.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}