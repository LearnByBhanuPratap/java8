package comparator;

import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class ComparingDoubleDemo {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getStudentList();

		Collections.sort(list, Comparator.comparingDouble(Student::getWeight));
		list.forEach(s -> System.out.print(s.getWeight() + " "));
	}
}