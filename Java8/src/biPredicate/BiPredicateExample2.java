package biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class BiPredicateExample2 {

	static BiPredicate<String, Integer> biPredicate = (name, score) -> {
		if (score > 80) {
			System.out.println(name + " is Topper");
			return true;
		}
		System.out.println(name + " is Not Topper");
		return false;
	};

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Test1", 90), new Student("Test2", 94),
				new Student("Test3", 33), new Student("Test4", 2));

		biPredicate.test("Ram", 90);
		biPredicate.test("Mohan", 10);

		for (Student student : students) {
			biPredicate.test(student.getName(), student.getMarks());
		}

	}

}

class Student {

	String name;
	Integer marks;

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}