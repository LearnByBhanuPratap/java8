package comparator;

import java.util.Comparator;
import java.util.List;

public class CompareDemoStreamSorted {
	
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();

		System.out.println("--- Sort Students by age ---");

		Comparator<Student> ageComp = (s1, s2) -> s1.getAge() - s2.getAge();
		
		list.stream().sorted(ageComp).forEach(s -> System.out.println(s));

		System.out.println("--- Sort Students by name ---");

		Comparator<Student> nameComp = (s1, s2) -> s1.getName().compareTo(s2.getName());
		
		list.stream().sorted(nameComp).forEach(s -> System.out.println(s));
	}
}