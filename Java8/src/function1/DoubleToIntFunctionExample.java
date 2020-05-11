package function1;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;

public class DoubleToIntFunctionExample {

	static DoubleToIntFunction doubleToIntFunction = a -> (int) a;

	static DoubleToIntFunction doubleToIntFunction1 = (a) -> {
		return (int) a;
	};

	public static void main(String[] args) {
		System.out.println(doubleToIntFunction.applyAsInt(90.67656));
		long data = doubleToLongFunction.applyAsLong(90.67656);
		System.out.println(doubleToLongFunction.applyAsLong(90.67656));
	}
	
	static DoubleToLongFunction doubleToLongFunction = a -> (long) a;

}
