package streamMethods.filter6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import streamMethods.Student;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class FilterMethodExample3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(20, 11, 28, 4, 5);
		
		Stream<Integer> newList = list.stream().filter(x -> x % 2 == 0);

		list.stream().filter(x -> x % 2 == 0).forEach(x -> System.out.println(x));

		System.out.println("-------");
		list.stream().filter(x -> x % 2 != 0).forEach(x -> System.out.println(x));
		
		
		System.out.println(Student.getListOfStudents().stream().filter(x -> x.getAge() > 20).count());
	}
}
