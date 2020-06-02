package biPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	static BiPredicate<String, Integer> biPredicate = (name, score) -> {
		if (score > 80) {
			System.out.println(name + " is Topper");
			return true;
		} else {
			System.out.println(name + " is Not Topper");
			return false;
		}
	};

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Test1", 90), new Student("Test2", 94),
				new Student("Test3", 33), new Student("Test4", 2));

		biPredicate.test("Ram", 90);
		biPredicate.test("Mohan", 34);

		for (Student student : students) {
			biPredicate.test(student.getName(), student.getScore());
		}
	}
}

class Student {

	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

}
