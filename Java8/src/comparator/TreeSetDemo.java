package comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student("Shyam", 18);
		Student s2 = new Student("Mohan", 20);
		Student s3 = new Student("Ram", 22);

		System.out.println("---TreeSet Order With Comparator---");

		Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
		TreeSet<Student> myTreeSet = new TreeSet<>(ageComparator);
		myTreeSet.addAll(Arrays.asList(s1, s2, s3));
		myTreeSet.forEach(s -> System.out.println(s));
		// System.out.println("Comparator: "+ myTreeSet.comparator());

		System.out.println("---TreeSet Natural Order (With Comparable)---");

		myTreeSet = new TreeSet<>();
		myTreeSet.addAll(Arrays.asList(s1, s2, s3));
		myTreeSet.forEach(s -> System.out.println(s));
	}
}