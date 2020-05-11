package operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatExample2 {

	public static void main(String args[]) {
		
		UnaryOperator<Integer> bitwiseOr = a -> a ^ 2;
		UnaryOperator<Integer> bitwiseAnd = a -> a & 2;
		
		Function<Integer, Integer> function = bitwiseOr.andThen(bitwiseAnd);
		System.out.println(function.apply(4));
	}
}
