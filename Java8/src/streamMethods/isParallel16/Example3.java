package streamMethods.isParallel16;

import java.util.stream.IntStream;

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
		System.out.println("-----Normal-----");

		IntStream range = IntStream.rangeClosed(1, 1000);
		
		long start = System.currentTimeMillis();
		
		range.forEach(System.out::println);
		
		System.out.println("sequential time Taken="+(System.currentTimeMillis()-start));
		// sequential time Taken=56 Ms
		System.out.println("-----Parallel-----");
		
		start = System.currentTimeMillis();
		
		IntStream range2 = IntStream.rangeClosed(1, 1000);
		
		range2.parallel().forEach(System.out::println);
		
		System.out.println("parallel time Taken="+(System.currentTimeMillis()-start));
		//parallel time Taken=13 Ms
	}

}
