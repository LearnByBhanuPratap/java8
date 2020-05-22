package streamMethods.flatMap9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example4 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);

		Stream<Integer> newList = list1.stream();

		// it will throw exception
		//newList.forEach(x -> System.out.println(x));

		//newList.forEach(x -> System.out.println(x));

		List<Integer> list2 = Arrays.asList(20, 11, 28, 54, 51);
		
		//Stream<Integer> stream = list2.stream();

		Supplier<Stream<Integer>> supplier = () -> list2.stream();

		supplier.get().forEach(x -> System.out.println(x));

		supplier.get().forEach(x -> System.out.println(x));

	}

}
