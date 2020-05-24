package collectMethods.groupBy4;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example6 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		List<String> list = Arrays.asList("AA", "AA", "BB", "AA", "CC", "BB", "DD");

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> finalMap = new LinkedHashMap<>();
		
		Stream<Entry<String, Long>> reversed = result.entrySet().stream()
				.sorted(Map.Entry.comparingByValue());
		
		
		reversed.forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

		System.out.println(finalMap);
		
		System.out.println("---------------");
		Map<String, Long> finalMap1 = new LinkedHashMap<>();
		Stream<Entry<String, Long>> reversed1 = result.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed());
		
		
		reversed1.parallel().forEachOrdered(e -> finalMap1.put(e.getKey(), e.getValue()));

		System.out.println(finalMap1);
		
		System.out.println("---------------");
		Map<String, Long> finalMap2 = new LinkedHashMap<>();
		Stream<Entry<String, Long>> reversed2 = result.entrySet().stream()
				.sorted(Map.Entry.<String, Long>comparingByValue().reversed());
		
		
		reversed2.parallel().forEach(e -> finalMap2.put(e.getKey(), e.getValue()));

		System.out.println(finalMap2);
	}

}
