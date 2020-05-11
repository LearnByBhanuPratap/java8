package comparator;

import java.util.Collections;

import java.util.Comparator;
import java.util.List;


public class ThenComparingIntDemo {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getStudentList();

		Comparator<Student> comparator = Comparator.comparing(Student::getName, (s1, s2) -> s1.charAt(0) - s2.charAt(0))
				.thenComparingInt(Student::getAge);

		Collections.sort(list, comparator);
		list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));
	}
}