package streamMethods.flatMapToDouble10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

public class Example3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("4.5", "7.7", "9", "90", "50.6");

		DoubleStream newData = list.stream().flatMapToDouble(a -> DoubleStream.of(Double.parseDouble(a)));
		newData.forEach(System.out::println);

	}
}
