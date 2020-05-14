package streamMethods;

import java.util.Arrays;
import java.util.List;

public class FindAnyMethodExample3 {

	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(201, 202, 203, 204);
		numList.stream().filter(n -> n % 2 == 0).findAny().ifPresent(e -> System.out.println(e));
	}

}
