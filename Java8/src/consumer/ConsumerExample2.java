package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {
	
	public static void main(String[] args) {
		
		Consumer<Integer> con = p -> System.out.println(p*p);

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.forEach(con);

	}
}
