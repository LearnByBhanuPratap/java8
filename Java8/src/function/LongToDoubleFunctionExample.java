package function;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionExample {

	static LongToDoubleFunction longToDoubleFunction = fun -> fun/9.0;
	
	public static void main(String[] args) {
		System.out.println(longToDoubleFunction.applyAsDouble(Long.MAX_VALUE));// 1.02481911520608614E18
		System.out.println(longToDoubleFunction.applyAsDouble(71l));//7.888888888888889
	}
}
