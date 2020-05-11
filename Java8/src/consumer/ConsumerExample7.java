package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample7 {

	static List<Integer> odd = new ArrayList<>();
	static List<Integer> even = new ArrayList<>();

	static Consumer<Integer> number = n -> {
		if (n % 2 == 0) {
			even.add(n);
		} else {
			odd.add(n);
		}
	};

	public static void main(String[] args) {

		Consumer<List<Integer>> printList = list -> list.forEach(n -> System.out.println(n));

		number.accept(10);
		number.accept(15);
		number.accept(25);
		number.accept(30);

		printList.accept(odd);

		printList.accept(even);
	}
}