package streamMethods;

import java.util.stream.Stream;

public class ConcatMethodExample4 {

	public static void main(String[] args) {

		Student[] bk1 = new Student[3];
		Student[] bk2 = new Student[3];

		bk1[0] = new Student("Hello", 2);
		bk1[1] = new Student("Java", 5);
		bk1[2] = new Student("8", 5);
		bk2[0] = new Student("you", 7);
		bk2[1] = new Student("are", 6);
		bk2[2] = new Student("awesome", 9);

		Stream<Student> stream = Stream.concat(Stream.of(bk1), Stream.of(bk2));
		
		stream.forEach(a -> System.out.println(a.getName()));

	}
}
