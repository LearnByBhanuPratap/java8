package function;

import java.util.function.Function;

public class UpperCaseFunction {

	Function<String, String> upperCase = (name) -> name.toUpperCase();

	public static void main(String[] args) {
		UpperCaseFunction upperCaseFunction = new UpperCaseFunction();
		System.out.println(upperCaseFunction.upperCase.apply("test"));
	}
}
