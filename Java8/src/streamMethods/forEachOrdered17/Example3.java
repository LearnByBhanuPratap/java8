package streamMethods.forEachOrdered17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 9);

		//list.stream().sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);
		
		list.stream().sorted().parallel().forEachOrdered(System.out::println);
		
		System.out.println("-----");
		list.stream().sorted().parallel().forEach(System.out::println);
	}

}
