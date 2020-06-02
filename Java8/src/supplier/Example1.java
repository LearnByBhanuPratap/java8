package supplier;

import java.util.function.Supplier;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	static double a = 80;
	static double b = 70;

	static Supplier<Double> ds = () -> 345.198;

	static Supplier<Double> ds1 = () -> Double.valueOf(345);

	static Supplier<Float> ds2 = () -> 345.198f;

	static Supplier<Double> ds3 = () -> Math.random() * 10000;

	static Supplier<Integer> ds4 = () -> "test".length();

	static Supplier<String> ds5 = () -> {
		return "test".toUpperCase().concat("Ram");
	};
	
	static Supplier<String> ds6 = () -> "test".toUpperCase().concat("Ram");
	
	

	public static void main(String[] args) {
		System.out.println(ds.get());
		System.out.println(ds1.get());
		System.out.println(ds1.get());
		System.out.println(ds3.get());
		System.out.println(ds4.get());
		System.out.println(ds5.get());
		System.out.println();
	}
}
