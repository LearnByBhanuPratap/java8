package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC");
		
		Stream<String> stream = list.stream();
		
		String output = list.stream().filter(e -> e.startsWith("M")).findAny().orElse("NA");
		System.out.println(output);

		List<Integer> numList = Arrays.asList(21, 22, 23, 24);
		numList.stream().filter(n -> n % 2 == 0).findAny().ifPresent(e -> System.out.println(e));
	}

}
