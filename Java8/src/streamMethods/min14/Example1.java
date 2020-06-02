package streamMethods.min14;

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
	
	static Comparator<Student> comparator = Comparator.comparing(Student::getAge);

	// Make sure you are watching video in sequence. because these topics are depends on previous
	// Comparator topic
	public static void main(String[] args) {

		List<Student> list1 = Student.getListOfStudents();

		Optional<Student> minData = list1.stream().min(Comparator.comparing(Student::getAge));

		System.out.println(minData.get().getAge());

		Optional<Student> minData1 = list1.stream().min(Comparator.comparing(Student::getName));

		System.out.println(minData1.get().getName());

		Optional<Student> minData2 = list1.stream().min((a,b) -> a.getName().compareTo(b.getName()));

		System.out.println(minData2.get().getAge()+" "+minData2.get().getName());
	}

}
