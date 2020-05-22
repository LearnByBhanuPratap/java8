package streamMethods.flatMapToDouble10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Example2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("4.5", "7.7", "9", "90", "50.6");

		DoubleStream doubleStream = DoubleStream.of(70.98, 80.65, Double.parseDouble("90.8776"));

		DoubleStream newData = list.stream().flatMapToDouble(a -> DoubleStream.of(Double.parseDouble(a)));

		newData.forEach(System.out::println);

	}
}
