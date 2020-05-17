package streamMethods.flatMapToDouble10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;

public class Example1 {

	public static void main(String[] args) {

		ToDoubleFunction<Integer> doubleFunction = a -> Double.valueOf(a);

		List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);

		List<Integer> list2 = Arrays.asList(10, 11, 15, 14, 25);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(list1);
		list.add(list2);

		DoubleStream newData = list.stream().flatMapToDouble(x -> x.stream().mapToDouble(doubleFunction));
		
		System.out.println(list);
		
		newData.forEach(x ->System.out.println(x));

	}
}
