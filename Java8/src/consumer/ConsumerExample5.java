package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample5 {

	Consumer<List<Integer>> consumer = (list) -> {
		for (Integer li : list) {
			System.out.println(li);
		}
	};

	public static void main(String[] args) {

		ConsumerExample5 example4 = new ConsumerExample5();

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		example4.consumer.accept(list);

	}

}
