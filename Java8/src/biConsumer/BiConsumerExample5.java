package biConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample5 {

	public static void main(String args[]) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(1);
		list1.add(3);
		list1.add(5);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(2);
		list2.add(1);
		list2.add(4);

		BiConsumer<List<Integer>, List<Integer>> compareBiConsumer = (li1, li2) -> {
			for (int i = 0; i < li1.size(); i++) {
				if (li1.get(i) != li2.get(i)) {
					System.out.println(li1.get(i) + " not equal");
				} else {
					System.out.println(li1.get(i) + " equal");
				}
			}

		};

		BiConsumer<List<Integer>, List<Integer>> display = (li1, li2) -> {
			li1.forEach(a -> System.out.print(a + " "));
			System.out.println();
			li2.forEach(a -> System.out.print(a + " "));
			System.out.println();
		};

		try {
			compareBiConsumer.andThen(display).accept(list1, list2);
		} catch (Exception e) {
			System.out.println("Exceptiion : " + e);
		}
	}
}