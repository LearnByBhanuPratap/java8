package function;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionExample1 {

	static DoubleToIntFunction doubleToIntFunction = fun -> (int) fun;

	public static void main(String[] args) {
		System.out.println(doubleToIntFunction.applyAsInt(90.47565476534));// 90
	}

}
