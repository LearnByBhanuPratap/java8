package streamMethods.filter6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class FilterMethodExample2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Test1", "", "Test3", "", "Test5", "Test3");

		Stream<String> newList = list.stream().filter(x -> x.length() > 3);

		long count = list.stream().filter(x -> x.length() > 3).count();

		System.out.println(count);

		Predicate<String> predicate = (a) -> a.startsWith("t");

		count = list.stream().filter(x -> x.startsWith("t")).count();

		System.out.println(count);

		count = list.stream().filter(x -> x.toLowerCase().startsWith("t")).count();

		System.out.println(count);
	}
}
