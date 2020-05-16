package streamMethods.forEach15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import streamMethods.Student;

public class ForEachMethodExample3 {

	static Consumer<Student> consumer = (Student s) -> {
		if (s.getAge() == 10) {
			System.out.print(s.getName() + " ");
		}
	};

	public static void main(String[] args) {

		Student student = new Student();

		List<Student> list = new ArrayList<>();
		list.add(new Student("Test1", 10));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test3", 30));

		list.forEach(consumer);
		System.out.println("-------");
		
		list.forEach(Student::getName);
		System.out.println("-------");
		
		list.forEach(student::printDeatils);
		System.out.println("-------");
		
		list.forEach(Student::printDeatils);
	}
}
