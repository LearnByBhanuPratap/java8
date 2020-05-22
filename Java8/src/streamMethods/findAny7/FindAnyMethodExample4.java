package streamMethods.findAny7;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class FindAnyMethodExample4 {

	public static void main(String[] args) {
		
		IntConsumer consumer = a ->System.out.println(a);
		
		IntStream intStream = IntStream.of(10, 20, 30, 40);
	
		
		intStream.filter(i -> i > 24).findAny().ifPresent(consumer);

		System.out.println("--------");
		
		LongStream longStream = LongStream.of(300l, 400l, 500l);
		
		longStream.filter(l -> l < 400).findAny().ifPresent(l -> System.out.println(l));

		System.out.println("--------");
		
		DoubleStream doubleStream = DoubleStream.of(100.52, 200.55, 300.66);
		
		doubleStream.filter(d -> d > 200).findAny().ifPresent(l -> System.out.println(l));
	}
}
