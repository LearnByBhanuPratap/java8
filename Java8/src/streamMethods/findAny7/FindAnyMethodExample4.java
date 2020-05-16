package streamMethods.findAny7;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FindAnyMethodExample4 {

	public static void main(String[] args) {
		
		IntStream intStream = IntStream.of(10, 20, 30, 40);
		intStream.filter(i -> i > 24).findAny().ifPresent(i -> System.out.println(i));

		System.out.println("--------");
		LongStream longStream = LongStream.of(300, 400, 500);
		longStream.filter(l -> l < 400).findAny().ifPresent(l -> System.out.println(l));

		System.out.println("--------");
		DoubleStream doubleStream = DoubleStream.of(100.52, 200.55, 300.66);
		doubleStream.filter(d -> d > 200).findAny().ifPresent(l -> System.out.println(l));
	}
}
