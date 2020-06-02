package streamMethods.flatMapToInt11;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import streamMethods.Student;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example3 {
	
	static ToIntFunction<Integer> toIntFunction = a ->a;

	
	public static void main(String[] args) {
		
		List<Student> list1 = Student.getListOfStudents();

		List<Student> list2 = Student.getListOfStudents();

		List<List<Student>> list = new ArrayList<List<Student>>();
		list.add(list1);
		list.add(list2);
		
		IntStream intData = list.stream().flatMapToInt(x ->x.stream().mapToInt(y -> y.getAge()));
		
		Set<Integer> listData = intData.boxed().collect(Collectors.toSet());
		
		System.out.println(listData);
		
	}

}
