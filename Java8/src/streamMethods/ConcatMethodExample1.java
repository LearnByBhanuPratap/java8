package streamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConcatMethodExample1 {

	public static void main(String[] args) {

		List<String> li1 = new ArrayList<String>();
		List<String> li2 = new ArrayList<String>();

		li1.add("AA");
		li1.add("BB");
		li1.add("CC");

		li2.add("DD");
		li2.add("EE");
		li2.add("FF");
		li2.add("FF");
		li2.add("FF");

		Stream<String> concat = Stream.concat(li1.stream(), li2.stream());

		concat.forEach(a -> System.out.println(a + " "));

		System.out.println("--------");
		Stream<String> concat1 = Stream.concat(li1.stream(), li2.stream()).distinct();

		concat1.forEach(a -> System.out.println(a + " "));
	}

}
