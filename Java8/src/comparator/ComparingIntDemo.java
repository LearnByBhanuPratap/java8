package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingIntDemo {
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();

		Collections.sort(list, Comparator.comparingInt(Student::getAge));
		list.forEach(s -> System.out.print(s.getAge() + " "));
	}
}