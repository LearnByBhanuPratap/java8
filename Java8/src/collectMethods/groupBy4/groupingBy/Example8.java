package collectMethods.groupBy4.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Example8 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		List<Student> items = getListOfStudents();

		Map<String, List<Student>> counting = items.stream()
				.collect(Collectors.groupingBy(Student::getName));

		System.out.println(counting);

		System.out.println("--------");

		Map<Integer, Set<String>> map = getListOfStudents_1().stream().collect(
				Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toSet())));
		System.out.println(map);
	}

	public static List<Student> getListOfStudents() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 9));
		list.add(new Student("Test4", 7));
		return list;
	}
	
	public static List<Student> getListOfStudents_1() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		return list;
	}

}
