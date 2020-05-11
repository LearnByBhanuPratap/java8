package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {

	public static void main(String[] args) {

		Consumer<Integer> con = p -> System.out.println(p);

		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.forEach(con);

	}
}
