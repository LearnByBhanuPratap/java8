package streamMethods.sorted27;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamMethods.Student;

public class SortedMethodExample1 {

	public static void main(String[] args) {

		List<String> li = Student.getListOfStudents_1();

		Stream<String> sorted = li.stream().sorted();

		sorted.forEach(x -> System.out.println(x));

		// get list of Students
		List<Student> li1 = Student.getListOfStudents();

		// this code will throw exception because we can't sort custom object
		// custom object should be of type comparable or Comparator
		
		Stream<Student> sorted1 = li1.stream().sorted();

		sorted1.forEach(a -> System.out.println(a.getAge()));
		
		
		System.out.println("--------------");
		Stream<Student> sorted2 = li1.stream().sorted(Comparator.comparing(Student::getAge));

		sorted2.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
		
		System.out.println("--------------");
		Stream<Student> sorted3 = li1.stream().sorted(Comparator.comparing(Student::getAge).reversed());

		sorted3.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
		
		System.out.println("--------------");
		List<Student> list = li1.stream().sorted(Comparator.comparing(Student::getAge).reversed()).collect(Collectors.toList());

		list.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
	}

}