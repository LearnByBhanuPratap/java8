package streamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnyMethodExample2 {

	List<String> list = new ArrayList<String>();

	void print() {
		String output = list.stream().filter(e -> e.startsWith("A")).findAny().orElse("null");
		System.out.println(output);

		List<Integer> numList = Arrays.asList(201, 202, 203, 204);
		numList.stream().filter(n -> n % 2 == 0).findAny().ifPresent(e -> System.out.println(e));
	}

	void add() {
		list.add("AA");
		list.add("CC");
		list.add("ADDDA");
	}

	void add_1() {
		list.add(0, "ADADDA");
	}

	public static void main(String[] args) {
		FindAnyMethodExample2 example2 = new FindAnyMethodExample2();
		example2.add();
		example2.print();
		example2.add_1();
		example2.print();
	}

}
