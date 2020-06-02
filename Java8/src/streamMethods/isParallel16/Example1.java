package streamMethods.isParallel16;

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


		Stream<String> stream = Stream.of("one", "two", "three", "four");
		
		Stream<String> stre = stream.parallel();
		
		System.out.println(stream.isParallel());
	}

}
