package function1;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	static DoubleFunction<Integer> doubleFunction = d -> (int) d * 20;
	
	static DoubleFunction<Integer> doubleFunction1 = d -> (int) d/20;
	
	static DoubleFunction<Float> doubleFunction3 = d -> (float) d/20;

	public static void main(String[] args) {
		System.out.println(doubleFunction.apply(20.90));
		System.out.println(doubleFunction1.apply(20.90));
	}

}
