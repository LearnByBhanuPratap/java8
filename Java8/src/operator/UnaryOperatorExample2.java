package operator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class UnaryOperatorExample2 {
	// Exclusive Or
	static UnaryOperator<Integer> operator = a -> a ^ 2;

	// Bitwise And
	static UnaryOperator<Integer> operator1 = a -> a & 2;

	// Exclusive Or
	static UnaryOperator<Integer> operator2 = a -> a * 2;

	// Bitwise And
	static UnaryOperator<Integer> operator13 = a -> a + 2;

	public static void main(String[] args) {

		Function<Integer, Integer> operation = operator.andThen(operator1);

		System.out.println(operation.apply(4));
		
		System.out.println(operator13.andThen(operator2).apply(4));
		
		System.out.println(operator13.compose(operator2).apply(4));
	}
}
