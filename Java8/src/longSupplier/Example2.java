package longSupplier;

import java.util.function.DoubleSupplier;
import java.util.function.LongSupplier;

public class Example2 {

	public static void main(String[] args) {

		Example2 example2 = new Example2();

		LongSupplier longSupplier = Example2::getLong1;

		DoubleSupplier doubleSupplier2 = example2::getLong2;

		System.out.println(longSupplier.getAsLong());

		System.out.println(doubleSupplier2.getAsDouble());
	}

	static long getLong1() {
		return 19;
	}

	long getLong2() {
		return 19;
	}
}
