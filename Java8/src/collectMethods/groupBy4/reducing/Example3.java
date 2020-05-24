package collectMethods.groupBy4.reducing;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Example3 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not
	 * understand because each video required previous concept
	 */
	public static void main(String[] args) {

		Function<Student, Integer> function = a -> a.getAge();

		BinaryOperator<Integer> binaryOperator = (a, b) -> a * b;

		List<Student> list = Student.getListOfStudents();

		Integer output = list.stream().collect(Collectors.reducing(3, Student::getAge, Integer::sum));
		
		//list.stream().collect(Collectors.reducing(3, x -> x.getAge(), (x,y) -> x+y));

		System.out.println(output);

		Integer output1 = list.stream().collect(Collectors.reducing(3, a -> a.getAge(), (x, y) -> x-y));

		System.out.println(output1);

	}

	public static List<Student> getListOfStudents() {
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
