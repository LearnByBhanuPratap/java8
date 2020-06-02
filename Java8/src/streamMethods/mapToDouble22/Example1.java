package streamMethods.mapToDouble22;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import streamMethods.Student;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();
		

	
		Stream<Student> stream = list.stream();
		
		stream.forEach(x -> System.out.println(x.getAge()));
		
		stream.forEach(x -> System.out.println(x.getAge()));
		
		System.out.println("-------");
		Supplier<Stream<Student>> stream1 = ()	-> 	Student.getListOfStudents().stream();
		
		stream1.get().forEach(x -> System.out.println(x.getAge()));
		
		stream1.get().forEach(x -> System.out.println(x.getAge()));

		System.out.println("-------");
		
		DoubleStream newList =  list.stream().mapToDouble(x -> Double.valueOf(x.getAge()));

		Set<Double> newData = newList.boxed().filter(x -> x > 20).collect(Collectors.toSet());
		

		System.out.println(newData);

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
