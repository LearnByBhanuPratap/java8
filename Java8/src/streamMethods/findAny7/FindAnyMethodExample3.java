package streamMethods.findAny7;

import java.util.Arrays;
import java.util.List;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class FindAnyMethodExample3 {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(201, 202, 203, 204);
		
		numList.stream().filter(n -> n % 2 == 0)
		
		.findAny().ifPresent(e -> System.out.println(e));
	}

}
