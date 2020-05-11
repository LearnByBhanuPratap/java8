package longSupplier;

import java.util.function.LongSupplier;

public class Example1 {

	static double a = 80;
	static double b = 70;

	static LongSupplier ds = () -> Long.parseLong("345.198");

	static LongSupplier ds1 = () -> 345;

	static LongSupplier ds2 = () -> {
		int val1 = 30;
		int val2 = 45;
		return val1 * val2;
	};

	public static void main(String[] args) {
		System.out.println(ds.getAsLong());
		System.out.println(ds1.getAsLong());
		System.out.println(ds1.getAsLong());
		System.out.println();
	}
}
