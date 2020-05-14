package stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TypeOfStreamsExample1 {

	public static void main(String[] args) {

		IntStream intStream = IntStream.of(10, 20, 30, 40);

		LongStream longStream = LongStream.of(100, 200, 300);

		DoubleStream doubleStream = DoubleStream.of(100.52, 200.55, 300.66);

		Stream<String> stream = Stream.of(null, "AA");
		
		Stream<Integer> intstream = Stream.of(10,30,40,50);

		Stream<String> stream1 = Stream.of(new String[] { "test1" });

		Stream<String[]> stream2 = Stream.of(new String[][] { { "test1" }, { "test2" } });

		Stream<String[]> stream3 = Stream.of(new String[][] { { "A", "Apple" }, { "M", "Mango" }, { "B", "Banana" } });

	}

}
