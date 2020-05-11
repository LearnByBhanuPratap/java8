package consumer1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example4 {

	static List<Integer> odd = new ArrayList<>();
	static List<Integer> even = new ArrayList<>();

	static Consumer<Integer> consumer = n -> {
		if (n % 2 == 0) {
			even.add(n);
		} else {
			odd.add(n);
		}
	};

	static Consumer<Integer> p = n -> System.out.println(n);

	static Consumer<List<Integer>> printConsumer = list -> {
		list.forEach(n -> System.out.println(n));
	};

	static Consumer<List<Integer>> printConsumer1 = list -> {
		list.forEach(p);
	};

	public static void main(String[] args) {
		consumer.accept(10);
		consumer.accept(11);
		consumer.accept(15);
		consumer.accept(20);
		consumer.accept(18);

		System.out.println(odd);
		System.out.println("------");
		System.out.println(even);
		
		printConsumer.accept(odd);
		System.out.println("------");
		printConsumer.accept(even);
	}
}
