package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen6 {

	static Consumer<List<Integer>> consumer1 = new Consumer<List<Integer>>() {
		@Override
		public void accept(List<Integer> t) {
			System.out.println("in consumer1");
			for (int i = 0; i < t.size(); i++) {
				if (t.get(i) % 2 == 0) {
					System.out.println(t.get(i));
				}
			}

		}
	};

	static Consumer<Integer> consumer2 = (Integer x) -> System.out.println(x);

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 8, 10);

		forEach(list, consumer2);
		System.out.println("==consumer2 ends==");
		forEach(list, (Integer x) -> System.out.println(x));

		consumer1.accept(list);

	}

	static <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T t : list) {
			consumer.accept(t);
		}
	}

}