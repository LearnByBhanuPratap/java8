package streamMethods.mapToLong24;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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

	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();
		

		LongStream newList = list.stream().mapToLong(x -> x.getAge());
		
		//System.out.println(newList.boxed().collect(Collectors.toList()));

		Map<Long, Long> newData = newList.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		newData.forEach((k,v) -> System.out.println(k+" "+v));

	}
	
	public static List<Student> getListOfStudents() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		return list;
	}

}
