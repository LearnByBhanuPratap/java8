package booleanSupplier;

import java.util.function.BooleanSupplier;
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

	static BooleanSupplier ds = () -> Boolean.valueOf("true");

	static BooleanSupplier ds1 = () -> 5 > 51;

	static BooleanSupplier ds2 = () -> {
		return "test".equalsIgnoreCase("TEST");
	};

	public static void main(String[] args) {
		System.out.println(ds.getAsBoolean());
		System.out.println(ds1.getAsBoolean());
		System.out.println(ds2.getAsBoolean());
		System.out.println();
	}
}
