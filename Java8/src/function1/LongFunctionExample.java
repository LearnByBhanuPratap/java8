package function1;

import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

public class LongFunctionExample {
	
	static LongFunction<String> longFunction = fun -> String.valueOf(fun*2);
	static LongFunction<Double> longFunction1 = fun -> (double)fun*2;
	
	public static void main(String[] args) {
		String data = longFunction.apply(65765l);
		System.out.println(longFunction.apply(65765l));
		
		System.out.println(doubleFunction.applyAsDouble(7));
		
		System.out.println(longToIntFunction.applyAsInt(7999l));
	}
	
	static LongToDoubleFunction doubleFunction = fun ->fun/9.0;
	
	static LongToIntFunction longToIntFunction = fun -> (int)fun;
	

}
