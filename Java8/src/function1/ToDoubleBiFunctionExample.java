package function1;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class ToDoubleBiFunctionExample {

	static ToDoubleBiFunction<Integer, Double> doubleBiFunction = (a, b) -> a + b;
	static ToDoubleBiFunction<Integer, Integer> doubleBiFunction1 = (a, b) -> a + b;

	public static void main(String[] args) {
		System.out.println(doubleBiFunction.applyAsDouble(20, 70.67544));
		System.out.println(doubleBiFunction1.applyAsDouble(20, 70));
		System.out.println(doubleFunction.applyAsDouble(9));
		
		System.out.println(doubleFunction1.applyAsDouble(9.90f));
	}

	static ToDoubleFunction<Integer> doubleFunction = a -> a * 8;
	
	static ToDoubleFunction<Float> doubleFunction1 = a -> a * 8;
}
