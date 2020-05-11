package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample3 {

	public static void main(String[] args) {

		List<Integer> newList = new ArrayList<Integer>();

		Consumer<Integer> con = p -> {
			newList.add(p * 2);
		};

		Consumer<Integer> con1 = p -> System.out.println(p);

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);

		list.forEach(con);

		newList.forEach(con1);

	}
}
