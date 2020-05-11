package function;

import java.util.function.Function;

public class StringLengthFunction {

	static Function<String, Integer> length = (name) -> name.length();

	public static void main(String[] args) {
		int value = StringLengthFunction.length.apply("test");
		System.out.println(value); // 4
	}
}
