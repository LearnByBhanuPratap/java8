package function;

import java.util.function.IntFunction;

public class IntFunctionExample {

	static IntFunction<Integer> intFunction = fun -> fun * fun;

	public static void main(String[] args) {
		System.out.println(intFunction.apply(90));// 8100
	}
}
