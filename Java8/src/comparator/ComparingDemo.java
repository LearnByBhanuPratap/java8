package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparingDemo {

	public static void main(String[] args) {

		List<Student> list = Student.getStudentList();

		Comparator<Student> schoolComparator1 = Comparator.comparing(Student::getSchool);
		Collections.sort(list, schoolComparator1);
		list.forEach(s -> System.out.print(s.getName() + "-" + s.getSchool().getSname() + " | "));
		System.out.println("\n-------------------");

		Comparator<Student> schoolComparator2 = Comparator.comparing(k -> k.getSchool(),(sch1, sch2) -> sch1.getCode() - sch2.getCode());
		
		Collections.sort(list, schoolComparator2);
		list.forEach(s -> System.out.print(s.getName() + "-" + s.getSchool().getCode() + " | "));
		System.out.println("\n-------------------");

		Comparator<Student> nameComparator1 = Comparator.comparing(Student::getName);
		Collections.sort(list, nameComparator1);
		list.forEach(s -> System.out.print(s.getName() + " "));
		System.out.println("\n-------------------");

		Comparator<Student> nameComparator2 = Comparator.comparing(Student::getName, (s1, s2) -> s2.compareTo(s1));
		Collections.sort(list, nameComparator2);
		list.forEach(s -> System.out.print(s.getName() + " "));
	}
}