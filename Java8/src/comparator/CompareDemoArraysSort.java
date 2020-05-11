package comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CompareDemoArraysSort {
	
	public static void main(String[] args) {
		Student st1 = new Student("Ram", 18);
		Student st2 = new Student("Shyam", 22);
		Student st3 = new Student("Mohan", 19);

		Student[] array = { st1, st2, st3 };

		System.out.println("--- Sort Students by age ---");

		Comparator<Student> ageComp = (s1, s2) -> s1.getAge() - s2.getAge();
		Arrays.sort(array, ageComp);
		for (Student s : array) {
			System.out.println(s);
		}

		System.out.println("--- Sort Students by name ---");

		Comparator<Student> nameComp = (s1, s2) -> s1.getName().compareTo(s2.getName());
		Arrays.sort(array, nameComp);
		for (Student s : array) {
			System.out.println(s);
		}
	}
}