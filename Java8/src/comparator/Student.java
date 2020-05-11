package comparator;

import java.util.Arrays;
import java.util.List;

public class Student {

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", homeDistance=" + homeDistance + ", weight=" + weight
				+ ", school=" + school + "]";
	}

	private String name;
	private int age;
	private long homeDistance;
	private double weight;
	private School school;

	public Student() {
		
	}
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, long homeDistance, double weight, School school) {
		this.name = name;
		this.age = age;
		this.homeDistance = homeDistance;
		this.weight = weight;
		this.school = school;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getHomeDistance() {
		return homeDistance;
	}

	public double getWeight() {
		return weight;
	}

	public School getSchool() {
		return school;
	}

	public static List<Student> getStudentList() {
		Student s1 = new Student("Ram", 18, 3455, 60.75, new School(101, "PQ College"));
		Student s2 = new Student("Shyam", 22, 3252, 65.80, new School(103, "RS College"));
		Student s3 = new Student("Mohan", 19, 1459, 65.20, new School(102, "AB College"));
		Student s4 = new Student("Mahesh", 20, 4450, 70.25, new School(104, "CD College"));
		List<Student> list = Arrays.asList(s1, s2, s3, s4);
		return list;
	}
	
	public void sum() {
		//return name;
	}
}