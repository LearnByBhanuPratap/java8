package biFunction;

import java.util.function.BiFunction;

public class Example2 {

	public static void main(String args[]) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

		try {
			add = add.andThen(null);
			System.out.println("Add = " + add.apply(2, 3));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
