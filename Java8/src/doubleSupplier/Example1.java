package doubleSupplier;

import java.util.function.DoubleSupplier;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	static double a = 80;
	static double b = 70;

	static DoubleSupplier ds = () -> Double.parseDouble("345.198");

	static DoubleSupplier ds1 = () -> 345.198;

	static DoubleSupplier ds2 = () -> 345.198f;

	static DoubleSupplier ds3 = () -> Math.random() * 10000;

	static DoubleSupplier ds4 = () -> a / b;

	static DoubleSupplier ds5 = () -> {
		int val1 = 30;
		int val2 = 45;
		return val1 * val2;
	};

	public static void main(String[] args) {
		
		System.out.println(ds.getAsDouble());
		System.out.println(ds1.getAsDouble());
		System.out.println(ds2.getAsDouble());
		System.out.println(ds3.getAsDouble());
		System.out.println(ds4.getAsDouble());
		System.out.println(ds5.getAsDouble());
		System.out.println();
	}
}
