package function;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionExample {

	// long rang -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	static DoubleToLongFunction doubleToLongFunction = fun -> (long) fun;

	public static void main(String[] args) {
		System.out.println(doubleToLongFunction.applyAsLong(98744434333232233232.6474870898666));
		// 9223372036854775807
	}

}
