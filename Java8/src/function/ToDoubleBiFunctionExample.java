package function;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionExample {

	static ToDoubleBiFunction<Integer, Double> toDoubleBiFunction = (fun1, fun2) -> fun1 + fun2;
	static ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction1 = (fun1, fun2) -> fun1*fun2;
	public static void main(String[] args) {
		System.out.println(toDoubleBiFunction.applyAsDouble(20, 70.678686));
		System.out.println(toDoubleBiFunction1.applyAsDouble(20, 70));
	}
}
