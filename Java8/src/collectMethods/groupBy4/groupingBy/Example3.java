package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example3 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");

		Map<String, Long> output = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(output);

	}

}
