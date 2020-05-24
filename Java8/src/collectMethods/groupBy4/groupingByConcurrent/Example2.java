package collectMethods.groupBy4.groupingByConcurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		for (int i = 0; i < 10; i++) {
			list.add(Double.valueOf(i));
		}
		
		Map<Double, Long> output = list.stream().collect(Collectors.groupingByConcurrent(Function.identity(),Collectors.counting()));
		
		System.out.println(output);
	}

}
