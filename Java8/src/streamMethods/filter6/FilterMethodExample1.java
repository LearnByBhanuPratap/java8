package streamMethods.filter6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class FilterMethodExample1 {

	public static void main(String[] args) {

		Predicate<String> predicate = (a) -> a.isEmpty();

		List<String> list = Arrays.asList("Test1", "", "Test3", "", "Test5", "Test3");

		long count = list.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count);

		count = list.stream().filter(x -> !x.isEmpty()).count();
		System.out.println(count);

	}
}
