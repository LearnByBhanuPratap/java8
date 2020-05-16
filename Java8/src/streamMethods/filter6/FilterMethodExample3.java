package streamMethods.filter6;

import java.util.Arrays;
import java.util.List;

public class FilterMethodExample3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20, 11, 28, 4, 5);

		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		System.out.println("-------");
		list.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
	}
}
