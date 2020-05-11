package function;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionExample {

	static IntToDoubleFunction intToDoubleFunction = fun -> fun * fun;

	public static void main(String[] args) {
		System.out.println(intToDoubleFunction.applyAsDouble(7648));// 5.8491904E7
		System.out.println(intToDoubleFunction.applyAsDouble(7));// 49.0
	}
}
