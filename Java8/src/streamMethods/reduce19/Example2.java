package streamMethods.reduce19;

import java.util.List;
import java.util.Optional;
import streamMethods.Student;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	public static void main(String[] args) {

		List<String> list = Student.getListOfStudents_1();
		
		System.out.println(list);
		
		Optional<String> String_combine = list.stream().reduce((str1, str2) -> str1 + "**" + str2);

		if (String_combine.isPresent()) {
			System.out.println(String_combine.get());
		}
	}
}
