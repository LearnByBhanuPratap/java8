package collectMethods.groupBy5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

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

		// java.util.stream.Collectors;
		Map<Object, List<String>> output1 = list.stream()
				.collect(Collectors.groupingByConcurrent(x -> x));

		System.out.println(output1);
		
		
		Map<Object, List<String>> output2 = list.stream()
				.collect(Collectors.groupingBy(x ->x.contains("O")));

		System.out.println(output2);
	}

}
