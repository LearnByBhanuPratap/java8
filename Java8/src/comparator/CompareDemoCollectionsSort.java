package comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemoCollectionsSort {
	
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();

		System.out.println("--- Sort Students by age ---");

		Comparator<Student> ageComp = (s1, s2) -> s1.getAge() - s2.getAge();
		Collections.sort(list, ageComp);
		list.forEach(s -> System.out.println(s));

		System.out.println("--- Sort Students by name ---");

		Comparator<Student> nameComp = (s1, s2) -> s1.getName().compareTo(s2.getName());
		Collections.sort(list, nameComp);
		list.forEach(s -> System.out.println(s));
	}
}