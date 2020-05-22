package streamMethods.mapToDouble22;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import streamMethods.Student;

public class Example2 {

	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();

		DoubleStream newList = list.stream().mapToDouble(x -> Double.valueOf(x.getAge()));
		
		//System.out.println(newList.boxed().collect(Collectors.toList()));

		Map<Double, Long> newData = newList.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		newData.forEach((k,v) -> System.out.println(k+" "+v));

	}

}
