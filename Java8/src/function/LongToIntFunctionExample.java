package function;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionExample {

	static LongToIntFunction longToIntFunction = fun -> (int) (fun);
	
	public static void main(String[] args) {
		System.out.println(longToIntFunction.applyAsInt(440L)); //440
	}
}
