package function;

import java.util.function.Function;

public class StringContainsFunction {

	static Function<String, Boolean> contains = (name) -> name.contains("Test");

	public static void main(String[] args) {
		System.out.println(StringContainsFunction.contains.apply("t")); // false
		System.out.println(StringContainsFunction.contains.apply("Test")); // false
	}

}
