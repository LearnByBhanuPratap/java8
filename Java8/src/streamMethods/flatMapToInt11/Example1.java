package streamMethods.flatMapToInt11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	static ToIntFunction<Integer> toIntFunction = a -> a;

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);

		List<Integer> list2 = Arrays.asList(10, 11, 15, 14, 25);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(list1);
		list.add(list2);

		System.out.println(list);

		Stream<List<Integer>> stream = list.stream();

		Stream<Integer> stream2 = list1.stream();

		Function<Integer, Integer> function = (a) -> a * 2;

		IntStream intData = list.stream().flatMapToInt(x -> x.stream().mapToInt(toIntFunction));

		
		List<Integer> listData = intData.boxed().collect(Collectors.toList());

		System.out.println(listData);

	}

}
