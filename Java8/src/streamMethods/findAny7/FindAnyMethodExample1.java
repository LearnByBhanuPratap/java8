package streamMethods.findAny7;

import java.util.Arrays;
import java.util.List;

public class FindAnyMethodExample1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("AA", "BB", "CC", "AAA");
		String output = list.stream().filter(e -> e.startsWith("A")).findAny().orElse("null");
		System.out.println(output);
	}

}
