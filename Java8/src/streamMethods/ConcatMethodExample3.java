package streamMethods;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class ConcatMethodExample3 {

	public static void main(String[] args) {
		Set<Student> set1 = new HashSet<Student>();
		Set<Student> set2 = new HashSet<>();

		set1.add(new Student("Test1", 200));
		set1.add(new Student("Test1", 300));
		set1.add(new Student("Test1", 150));

		set2.add(new Student("Test1", 200));
		set2.add(new Student("Test1", 300));
		set2.add(new Student("Test1", 400));

		Stream<Student> set = Stream.concat(set1.stream(), set2.stream());

		set.forEach(a -> System.out.println(a.getName() + " " + a.getAge()));
		
		System.out.println("------------");
		Stream<Student> distinct = Stream.concat(set1.stream(), set2.stream()).distinct();

		distinct.forEach(a -> System.out.println(a.getName() + " " + a.getAge()));
		
		System.out.println("------------");
		Stream<Set<Student>> stream = Stream.concat(Stream.of(set1), Stream.of(set2));
		
		stream.forEach(a -> a.stream().forEach(b -> System.out.println(b.getAge())));
				
	}
}
