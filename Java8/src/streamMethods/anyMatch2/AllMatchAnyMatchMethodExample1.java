package streamMethods.anyMatch2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import streamMethods.Student;

public class AllMatchAnyMatchMethodExample1 {

	static Predicate<Student> predicate = s -> s.getAge() > 20;

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		list.add(new Student("Test1", 10));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test1", 90));
		list.add(new Student("Test2", 7));
		list.add(new Student("Test3", 100));

		boolean allMatch = list.stream().allMatch(predicate);

		System.out.println(allMatch);

		boolean anyMatch = list.stream().anyMatch(predicate);

		System.out.println(anyMatch);
		
		boolean startsWith = list.stream().anyMatch(s ->s.getName().startsWith("Bhanu"));

		System.out.println(startsWith);

	}
}
