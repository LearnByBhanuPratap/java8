package streamMethods.reduce19;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamMethods.Student;

public class Example3 {

	public static void main(String[] args) {


		List<Student> list = Student.getListOfStudents();

		// if you have any doubt please watch Comparator video first
		Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
		
		BiConsumer<String, Integer> biConsumer = (k,v) -> System.out.println(k +" "+v);
		
		Stream<Student> list1 = list.stream();

		Map<?, Optional<Student>> map = list.stream().collect(
				Collectors.groupingBy(Student::getClass, Collectors.reducing(BinaryOperator.maxBy(nameComparator))));

		map.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
				+ (v.get().getAge() + " Name:" + v.get().getName())));
	}
}
