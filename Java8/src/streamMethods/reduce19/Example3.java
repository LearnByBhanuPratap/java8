package streamMethods.reduce19;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Example3 {

	public static void main(String[] args) {


		List<Student> list = Student.getListOfStudents();

		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

		Map<?, Optional<Student>> map = list.stream().collect(
				Collectors.groupingBy(Student::getClass, Collectors.reducing(BinaryOperator.maxBy(nameComparator))));

		map.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
				+ (v.get().getAge() + " Name:" + v.get().getName())));
	}
}
