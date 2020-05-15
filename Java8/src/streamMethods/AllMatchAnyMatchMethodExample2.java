package streamMethods;

import java.util.List;
import java.util.function.Predicate;

public class AllMatchAnyMatchMethodExample2 {

	static Predicate<Student> predicate = s -> s.getAge() > 20;
	
	static Predicate<Student> predicate2 = s -> s.getAge() > 200;
	
	static Predicate<Student> predicate3 = e -> e.getAge() < 10 && e.getName().startsWith("T");
	
	static Predicate<Student> predicate4 = e -> e.getAge() < 20 && e.getName().startsWith("T");

	public static void main(String[] args) {

		List<Student> list = Student.getListOfStudents();
		
		System.out.println(list.stream().allMatch(predicate3));
		
		System.out.println(list.stream().anyMatch(predicate3));
		
		System.out.println(list.stream().noneMatch(predicate3));
		
		System.out.println(list.stream().noneMatch(predicate));
		
		System.out.println(list.stream().noneMatch(predicate2));
		
		System.out.println(list.stream().noneMatch(predicate4));

	}
}
