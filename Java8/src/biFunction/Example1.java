package biFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example1 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	static BiFunction<Integer, Integer, Integer> addFunction = (num1, num2) -> (num1 + num2);

	static Function<Integer, Integer> multipleFunction = (num1) -> (num1 * 5);

	public static void main(String[] args) {

		System.out.println(addFunction.apply(10, 25));

		Integer status = addFunction.andThen(multipleFunction).apply(10, 25);
		System.out.println(status);
		status = addFunction.andThen(result -> result * 5).andThen(result -> result % 2).apply(10, 25);
		System.out.println(status);
	}
}
