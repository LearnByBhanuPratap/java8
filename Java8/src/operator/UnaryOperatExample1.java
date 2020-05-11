package operator;

import java.util.function.UnaryOperator;

public class UnaryOperatExample1 {

	public static void main(String args[]) {
		//exclusive-or 
		UnaryOperator<Integer> bitwiseOr = a -> a^2;
		System.out.println(bitwiseOr.apply(4));
		
		//Bitwise AND
		UnaryOperator<Integer> bitwiseAnd = a -> a & 2;
		System.out.println(bitwiseAnd.apply(4));
		
		// 100
		// 010
		//= 110
		// 2*
	}
}
