package biFunction;

import java.util.function.BiFunction;

public class Example3 {

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
