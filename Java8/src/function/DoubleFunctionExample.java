package function;

import java.util.function.DoubleFunction;

public class DoubleFunctionExample {

	static DoubleFunction<Integer> doubleFunction = d -> (int)(d * 10); 
	
	static DoubleFunction<Integer> doubleFunction1 = d -> (int)d/3;
	
	public static void main(String[] args) {
		
		System.out.println(doubleFunction.apply(20.90)); // 290	
		System.out.println(doubleFunction.apply(20.90)); // 290	
	}
}
