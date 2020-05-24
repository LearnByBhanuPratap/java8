package doubleSupplier;

import java.util.function.DoubleSupplier;

public class Example1 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {
		DoubleSupplier doubleSupplier = () -> Double.parseDouble("345.456");

		DoubleSupplier doubleSupplier1 = () -> 345.456;

		DoubleSupplier doubleSupplier2 = () -> 345.456f;

		DoubleSupplier doubleSupplier3 = () -> 80 / 70;

		DoubleSupplier doubleSupplier4 = () -> {
			int a = 90;
			int b = 100;
			return a * b;
		};

		System.out.println(doubleSupplier.getAsDouble());

		System.out.println(doubleSupplier2.getAsDouble());

		System.out.println(doubleSupplier3.getAsDouble());
	}

}
