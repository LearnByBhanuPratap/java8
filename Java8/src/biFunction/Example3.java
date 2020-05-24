package biFunction;

import java.util.function.BiFunction;

public class Example3 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		add = add.andThen(a -> a / 0);

		try {
			System.out.println("add = " + add.apply(2, 3));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}
}
