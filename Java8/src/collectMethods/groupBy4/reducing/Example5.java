package collectMethods.groupBy4.reducing;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example5 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not
	 * understand because each video required previous concept
	 */
	public static void main(String[] args) {

		Stream<Integer> s = Stream.of(5, 10, 20, 50).parallel();
		
		String str = s.collect(Collectors.reducing("", x -> Integer.toString(x), (s1, s2) -> s1 + s2));
		System.out.println(str);

	}

}
