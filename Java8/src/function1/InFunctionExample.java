package function1;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;

public class InFunctionExample {

	static IntFunction<Double> function = a -> a * 9.987;

	static IntFunction<Double> function1 = a -> (double) a * 9;
	
	static IntFunction<Integer> function3 = a -> "test".length();
	
	static IntFunction<Float> function4 = a -> (float)a/8;
	
	static IntToDoubleFunction doubleFunction = a -> a * 9.987;
	
	static IntToDoubleFunction doubleFunction1 = a -> a * 9;
	
	static IntToDoubleFunction doubleFunction2 = a -> a * a;

	public static void main(String[] args) {

		System.out.println(function.apply(90));
		
		System.out.println(function1.apply(9));
		
		System.out.println(doubleFunction.applyAsDouble(90));
		
		System.out.println(doubleFunction1.applyAsDouble(90));
		
		System.out.println(doubleFunction2.applyAsDouble(7648));
	}
}
