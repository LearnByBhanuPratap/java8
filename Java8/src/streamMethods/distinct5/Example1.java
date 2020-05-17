package streamMethods.distinct5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	public static void main(String[] args) {
		
		Consumer<String> consumer = a -> System.out.println(a);

		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("BB");
		list.add("EE");
		list.add("BB");

		Stream<String> distinct = list.stream().distinct();
		
		distinct.forEach(consumer);

		List<String> newList = list.stream().distinct().collect(Collectors.toList());

		System.out.println(newList);
		
		List<String> list2 = Arrays.asList("AA", "BB", "CC", "BB", "CC", "AA", "AA");

		long count = list2.stream().distinct().count();

		System.out.println("distinct elements:" + count);

		String output = list2.stream().distinct().collect(Collectors.joining(","));

		System.out.println(output);
		
		String output1 = list2.stream().distinct().collect(Collectors.joining("###"));

		System.out.println(output1);
	}

}
