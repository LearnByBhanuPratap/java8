package function;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionExample {
	
	static ToIntBiFunction<String,String> toIntBiFunction  = (x,y)-> Integer.parseInt(x) +Integer.parseInt(y);
	
	public static void main(String[] args) {
		System.out.println(toIntBiFunction.applyAsInt("44","80"));
	}

}
