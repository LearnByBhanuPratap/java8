package function;

import java.util.function.Function;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class FunctionExample1 {

	Function<Integer, String> ob = fun1 -> "Age:" + fun1;

	Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;

	LongToIntFunction longToIntFunction = fun -> (int) (fun * fun);

	ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (fun1, fun2) -> fun1 + fun2;

	ToDoubleFunction<Integer> toDoubleFunction = fun1 -> fun1 * 301;

	ToIntBiFunction<Integer, Integer> toIntBiFunction = (fun1, fun2) -> fun1 + fun2;

	ToIntFunction<Integer> toIntFunction = fun -> fun * 123;

	ToLongBiFunction<Integer, Integer> toLongBiFunction = (fun1, fun2) -> fun1 - fun2;

	ToLongFunction<Integer> toLongFunction = fun1 -> fun1 + 50;

	public static void main(String[] args) {

		FunctionExample1 functionExample1 = new FunctionExample1();

		Function<Integer, Integer> add1 = functionExample1.makeAdder.apply(1);
		Function<Integer, Integer> add2 = functionExample1.makeAdder.apply(2);
		Function<Integer, Integer> add3 = functionExample1.makeAdder.apply(3);

		
	}

}
