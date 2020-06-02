package streamMethods.peek18;

import java.util.List;
import java.util.stream.Collectors;
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

	public static void main(String[] args) {

		List<String> list = Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
		
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		
		System.out.println(list);
		
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
		
		.forEach(x -> System.out.println());
	}

}
