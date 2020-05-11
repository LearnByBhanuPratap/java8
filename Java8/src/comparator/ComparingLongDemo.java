package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingLongDemo {
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();

		Collections.sort(list, Comparator.comparingLong(Student::getHomeDistance));
		list.forEach(s -> System.out.print(s.getHomeDistance() + " "));
	}
}