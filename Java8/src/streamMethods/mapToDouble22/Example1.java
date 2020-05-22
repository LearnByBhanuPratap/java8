package streamMethods.mapToDouble22;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import streamMethods.Student;

public class Example1 {

	public static void main(String[] args) {
		List<Student> list = Student.getListOfStudents();

		DoubleStream newList = list.stream().mapToDouble(x -> Double.valueOf(x.getAge()));

		Set<Double> newData = newList.boxed().filter(x -> x > 20).collect(Collectors.toSet());

		System.out.println(newData);

	}

}
