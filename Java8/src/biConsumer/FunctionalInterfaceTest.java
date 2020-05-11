package biConsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> System.out.printf("%s , %s", a, b);
		biConsumer.accept("A", "B");

		BiFunction<String, String, Boolean> biFunction = (a, b) -> a.equals(b) ? true : false;
		System.out.println(biFunction.apply("a", "b"));

		BiPredicate<String, String> biPredicate = (a, b) -> {
			return a.equals(b);
		};
		System.out.println(biPredicate.test("A", "B"));

	}
}