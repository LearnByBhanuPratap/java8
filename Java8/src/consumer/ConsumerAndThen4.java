package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen4 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(300, 400, 500, 600);

		Consumer<List<Integer>> printConsumer = 
				listConsumer -> list.forEach(System.out::println);

		printConsumer.accept(list);
	}
}
