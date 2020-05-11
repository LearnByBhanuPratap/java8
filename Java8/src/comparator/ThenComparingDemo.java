package comparator;

import java.util.Collections;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ThenComparingDemo {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getStudentList();

		System.out.println("--------Example-1---------");
		
		Consumer<Student> c1= Student::sum;
		
		Comparator<Student> compByStdName = Comparator.comparing(Student::getName);
		Comparator<Student> schoolComparator1 = Comparator.comparing(Student::getAge) // sort by student age
				.thenComparing(compByStdName); // then sort by student name

		Collections.sort(list, schoolComparator1);
		list.forEach(s -> System.out.println(s.getName() + "-" + s.getAge()));

		System.out.println("--------Example-2---------");

		Comparator<Student> schoolComparator2 = Comparator.comparing(Student::getSchool) // sort by school natural
																							// ordering i.e. city
				.thenComparing(Student::getAge) // then sort by student age
				.thenComparing(Student::getName); // then sort by student name

		Collections.sort(list, schoolComparator2);
		// list.forEach(s->System.out.println(s.getName() + "-" + s.getAge()+ "-" +
		// s.getSchool().getCity()));

		System.out.println("--------Example-3---------");

		Comparator<Student> schoolComparator3 = Comparator.comparing(Student::getSchool) // sort by school natural
																							// ordering i.e. city
				.thenComparing(Student::getSchool,
						(school1, school2) -> school1.getSname().compareTo(school2.getSname())) // then sort by school
																								// name
				.thenComparing(Student::getAge) // then sort by student age
				.thenComparing(Student::getName); // then sort by student name

		Collections.sort(list, schoolComparator3);
		// list.forEach(s->System.out.println(s.getName() + "-" + s.getAge()+ "-" +
		// s.getSchool().getSname() + "-" + s.getSchool().getCity()));
	}
}