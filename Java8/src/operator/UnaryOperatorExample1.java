package operator;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample1 {

	// Exclusive Or
	static UnaryOperator<Integer> operator = a -> a ^ 2;

	// Bitwise And
	static UnaryOperator<Integer> operator1 = a -> a & 2;

	public static void main(String[] args) {

		System.out.println(operator.apply(4));
		
		System.out.println(operator1.apply(4));
	}

}
