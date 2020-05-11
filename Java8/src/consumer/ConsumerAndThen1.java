package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(300, 400, 500, 600);

		Consumer<List<Integer>> consumer = listConsumer -> {
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * list.get(i));
			}
		};

		Consumer<List<Integer>> printConsumer = listConsumer -> list.forEach(n -> System.out.println(n));

		consumer.andThen(printConsumer).accept(list);
	}
}