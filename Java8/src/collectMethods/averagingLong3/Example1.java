package collectMethods.averagingLong3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example1 {

	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {
		
		List<Long> list = new ArrayList<Long>();
		for (int i = 0; i < 10; i++) {
			list.add(Long.valueOf(i));
		}
		
		Function<Long, Long> function = a -> a;
		Double output = list.stream().collect(Collectors.averagingLong(x ->x));
		
		System.out.println(output.longValue());
	}

}
