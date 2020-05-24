package doubleSupplier;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class Example2 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		Random random = new Random();

		DoubleSupplier doubleSupplier = random::nextDouble;

		DoubleSupplier doubleSupplier1 = Example2::getDOuble;

		Example2 example2 = new Example2();

		DoubleSupplier doubleSupplier2 = example2::getDOuble1;

		System.out.println(doubleSupplier.getAsDouble());

		LongSupplier longSupplier = () -> 900;

		IntSupplier intSupplier = () -> 900;

		IntSupplier intSupplier1 = example2::getInt;

		// intSupplier;

	}

	static double getDOuble() {
		return 19.89;
	}

	double getDOuble1() {
		return 19.89;
	}

	int getInt() {
		return 19;
	}

}
