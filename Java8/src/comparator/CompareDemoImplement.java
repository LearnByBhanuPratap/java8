package comparator;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

class AgeComparator implements Comparator<Student>, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getAge() - s2.getAge();
	}
}

class NameComparator implements Comparator<Student>, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

public class CompareDemoImplement {
	public static void main(String[] args) {
		List<Student> list = Student.getStudentList();

		System.out.println("--- Sort Students by age ---");

		AgeComparator ageComparator = new AgeComparator();
		list.sort(ageComparator);
		list.forEach(s -> System.out.println(s));

		System.out.println("--- Sort Students by name ---");

		NameComparator nameComparator = new NameComparator();
		list.sort(nameComparator);
		list.forEach(s -> System.out.println(s));
	}
}