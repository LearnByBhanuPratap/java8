package comparator;

import java.util.Comparator;
import java.util.List;


public class ComparatorReversedDemo {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getStudentList();
		Comparator<Student> ageComparator = (s1, s2) -> s1.getAge() - s2.getAge();
		list.stream().sorted(ageComparator.reversed()).forEach(s -> System.out.print(s.getAge() + " "));
		System.out.println("\n-----------");
		Comparator<Student> nameComparator = (s1, s2) -> s1.getName().compareTo(s2.getName());
		list.stream().sorted(nameComparator.reversed()).forEach(s -> System.out.print(s.getName() + " "));
		System.out.println("\n-----------");
		list.stream().sorted(Comparator.comparing(Student::getAge).reversed())
				.forEach(s -> System.out.print(s.getAge() + " "));
		System.out.println("\n-----------");
		list.stream().sorted(Comparator.comparing(Student::getName).reversed())
				.forEach(s -> System.out.print(s.getName() + " "));
		
		list.sort(ageComparator.reversed());
		
		System.out.println(list);
		
	}
}