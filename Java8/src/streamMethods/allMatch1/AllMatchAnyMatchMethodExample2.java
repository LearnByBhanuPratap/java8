package streamMethods.allMatch1;

import java.util.List;
import java.util.function.Predicate;
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
public class AllMatchAnyMatchMethodExample2 {

	static Predicate<Student> predicate = s -> s.getAge() > 20;
	
	static Predicate<Student> predicate2 = s -> s.getAge() > 200;
	
	static Predicate<Student> predicate3 = e -> e.getAge() < 10 && e.getName().startsWith("T");
	
	static Predicate<Student> predicate4 = e -> e.getAge() < 20 && e.getName().startsWith("T");

	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		List<Student> list = Student.getListOfStudents();
		
		Stream<Student> s1 = list.stream();
		
		System.out.println(list.stream().allMatch(predicate3)); //false
		
		System.out.println(list.stream().anyMatch(predicate3)); //false
		
		System.out.println(list.stream().noneMatch(predicate3)); // true
		
		System.out.println(list.stream().noneMatch(s ->s.getAge() > 20)); // false
		
		System.out.println(list.stream().noneMatch(predicate2)); //true
		
		System.out.println(list.stream().noneMatch(predicate4)); //false

	}
}
