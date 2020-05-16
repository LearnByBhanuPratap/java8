package streamMethods.concat31;

import java.util.stream.Stream;

public class ConcatMethodExample2 {

	public static void main(String[] args) {

		Stream<String> s1 = Stream.of("Test1", "Test2", "Test3");
		Stream<String> s2 = Stream.of("Test1", "Test2", "Test3");
		
		Stream<String> s = Stream.concat(s1, s2);
		
		s.forEach(e -> System.out.println(e + " "));
		
		System.out.println("--------");

		s1 = Stream.of("Test1", "Test2", "Test3");
		s2 = Stream.of("Test1", "Test2", "Test5");
		
		s = Stream.concat(s1, s2).distinct();
		
		s.forEach(e -> System.out.println(e + " "));
	}

}
