package operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperatorExample1 {

	public static void main(String args[]) {

		BinaryOperator<Integer> operator = (a, b) -> a + b;
		Function<Integer, Integer> function = n -> n * 2;
		
		System.out.println(operator.andThen(function).apply(1, 6));

	}
}
