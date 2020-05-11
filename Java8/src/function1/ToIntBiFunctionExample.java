package function1;

import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class ToIntBiFunctionExample {

	static ToIntBiFunction<Double, Integer> biFunction = (fun1, fun2) -> (int) (fun1 * fun2);

	static ToIntBiFunction<String, String> biFunction1 = (fun1, fun2) -> Integer.parseInt(fun1)
			* Integer.parseInt(fun2);

	public static void main(String[] args) {
		System.out.println(biFunction.applyAsInt(90.8, 9));

		System.out.println(biFunction1.applyAsInt("90", "9"));

		System.out.println(intFunction.applyAsInt("test"));
		
		System.out.println(intFunction1.applyAsInt(9.8));
	}

	static ToIntFunction<String> intFunction = a -> a.length();

	static ToIntFunction<Double> intFunction1 = a -> (int) (a*2);
}
