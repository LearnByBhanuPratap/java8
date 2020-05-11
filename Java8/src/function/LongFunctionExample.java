package function;

import java.util.function.LongFunction;

public class LongFunctionExample {

	static LongFunction<String> longFunction = fun -> String.valueOf(fun * 2);

	public static void main(String[] args) {
		String value = longFunction.apply(567544l);
		System.out.println(value);// 1135088
	}
}
