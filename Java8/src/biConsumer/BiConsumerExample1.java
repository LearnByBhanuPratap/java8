package biConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample1 {

	BiConsumer<List<Integer>, List<Integer>> biConsumerCompare = (list1, list2) -> {
		
		if (list1.size() != list2.size()) {
			System.out.println("False");
		} 
		else {
			for (int i = 0; i < list1.size(); i++)
				if (list1.get(i) != list2.get(i)) {
					System.out.println("False");
					return;
				}
			System.out.println("True");
		}
	};

	public static void main(String args[]) {

		BiConsumerExample1 biConsumerExample1 = new BiConsumerExample1();

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(1);
		list1.add(3);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(1);
		list2.add(2);

		biConsumerExample1.biConsumerCompare.accept(list2, list1);
	}
}