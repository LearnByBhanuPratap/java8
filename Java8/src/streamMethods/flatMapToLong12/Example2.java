package streamMethods.flatMapToLong12;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

import streamMethods.Student;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	static ToIntFunction<Integer> toIntFunction = a -> a;

	// Always watch Video in sequence otherwise you will loose concept
	public static void main(String[] args) {

		List<Student> list1 = Student.getListOfStudents();

		List<Student> list2 = Student.getListOfStudents();

		List<List<Student>> list = new ArrayList<List<Student>>();
		list.add(list1);
		list.add(list2);

		LongStream intData = list.stream().flatMapToLong(x -> x.stream().mapToLong(y -> y.getAge()));

		List<Long> listData = intData.boxed().collect(Collectors.toList());

		System.out.println(listData);

	}

}
