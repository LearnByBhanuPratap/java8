package function1;

import java.util.function.Function;

public class AddStringFunction1 {

	static Function<String, String> addString = (name) -> name.toUpperCase().concat("Ram");

	static Function<String, Integer> addString1 = (name) -> name.length();

	static Function<String, Boolean> addString3 = (name) -> name.contains("test");

	static Function<Integer, Boolean> addString4 = (name) -> name > 10;

	static Function<Integer, Integer> addString5 = (name) -> name % 2;

	static Function<String, String> addString6 = (name) -> name.toLowerCase();

	static Function<Integer, Integer> add = a -> 2 + a;

	static Function<Integer, Integer> multiply = a -> 2 * a;

	public static void main(String[] args) {
		System.out.println(addString.apply("test"));

		System.out.println(addString1.apply("test"));

		System.out.println(addString3.apply("123"));

		System.out.println(addString4.apply(100));

		System.out.println(addString4.apply(10));

		System.out.println(addString5.apply(10));

		System.out.println(addString5.apply(11));

		System.out.println(addString.andThen(addString6).apply("test"));

		System.out.println(addString.andThen(addString1).andThen(addString4).apply("testgdgsjgd"));
		
		Function<Integer, Integer> data = multiply.compose(add);
		
		System.out.println(data.apply(3));

	}

}
