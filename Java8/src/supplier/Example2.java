package supplier;

import java.util.Random;
import java.util.function.Supplier;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	public static void main(String[] args) {
		
		Example2 example2 = new Example2();

		Random random = new Random();
		
		Supplier<Double> supplier = random::nextDouble;

		Supplier<Double> supplier2 = Example2::getDouble1;

		Supplier<Double> supplier3 = example2::getDouble2;

		System.out.println(supplier.get());

		System.out.println(supplier2.get());

		System.out.println(supplier3.get());
	}

	static double getDouble1() {
		return 19.78;
	}

	double getDouble2() {
		return 19.78;
	}
}
