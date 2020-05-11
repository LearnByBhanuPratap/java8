package function;

import java.util.function.Function;

public class AddStringFunction {

	static Function<String, String> addString = (name) -> name.toUpperCase().concat("Ram");

	public static void main(String[] args) {
		String value = AddStringFunction.addString.apply("test");
		System.out.println(value); // TESTRam
	}

}
