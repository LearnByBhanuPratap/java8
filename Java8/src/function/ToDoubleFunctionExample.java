package function;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionExample {
	
	static ToDoubleFunction<Integer> toDoubleFunction = fun1 -> fun1 * 301;
	
	public static void main(String[] args) {
		System.out.println(toDoubleFunction.applyAsDouble(90000)); // 2.709E7
		System.out.println(toDoubleFunction.applyAsDouble(900)); //270900.0
	}
}
