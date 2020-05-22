package streamMethods.flatMap9;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example3 {

	public static void main(String[] args) {

		Stream<String> stringStream = Stream.of("A", "B", "C", "D");

		//stringStream.forEach(a -> System.out.println(a));

		//stringStream.forEach(a -> System.out.println(a));

		Supplier<Stream<String>> streamSupplier = () -> Stream.of("A", "B", "C", "D");
		
		streamSupplier.get().forEach(a -> System.out.println(a));

		streamSupplier.get().forEach(a -> System.out.println(a));

	}

}
