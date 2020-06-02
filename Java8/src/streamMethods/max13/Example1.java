package streamMethods.max13;

import java.util.Comparator;
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
public class Example1 {
	
	static Comparator<Student> comparator = (a, b) -> a.getName().compareTo(b.getName());

	// Make sure you are watching video in sequence. because these topics are depends on previous
	// Comparator topic
	public static void main(String[] args) {

		List<Student> list1 = Student.getListOfStudents();

		Optional<Student> maxData = list1.stream()
				.max(Comparator.comparing(Student::getAge));

		System.out.println(maxData.get().getAge()); //50

		Optional<Student> maxData1 = list1.stream().max(comparator);

		System.out.println(maxData1.get().getName()); // Test5

		Optional<Student> maxData2 = list1.stream().max((a,b) -> a.getName().compareTo(b.getName()));

		System.out.println(maxData2.get().getAge()+" "+maxData2.get().getName());
	}

}
