package biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample2 {

	BiConsumer<Integer, Integer> addBiConsumer = (a, b) -> System.out.println(a + b);
	BiConsumer<Integer, Integer> multiplyBiConsumer = (a, b) -> System.out.println(a * b);

	public static void main(String args[]) {
		BiConsumerExample2 biConsumerExample2 = new BiConsumerExample2();

		biConsumerExample2.addBiConsumer.andThen(biConsumerExample2.multiplyBiConsumer).accept(3, 4);
	}
}