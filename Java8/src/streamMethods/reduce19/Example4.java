package streamMethods.reduce19;

import java.util.List;
import streamMethods.Student;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example4 {

	public static void main(String[] args) {

		List<String> list = Student.getListOfStudents_1();
		
		String data = list.stream().reduce("Test", (str1, str2) -> str1 + "**" + str2);

		System.out.println(data);
	}
}
