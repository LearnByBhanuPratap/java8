package streamMethods;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student() {
	}

	public void printDeatils(Student student) {
		System.out.println("name=" + student.getName() + " age" + student.getAge());
	}

	public void printDeatils(int id, Student student) {
		System.out.println("key=" + id + " name=" + student.getName() + " age=" + student.getAge());
	}

	public void printDeatils() {
		System.out.println("name=" + getName() + " age" + getAge());
	}

	public static List<Student> getListOfStudents() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		return list;
	}

	public static List<String> getListOfStudents_1() {
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("BB");
		return list;
	}

	@Override
	public int hashCode() {
		int hashno = 7;
		hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
		return hashno;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		final Student book = (Student) obj;
		if (this == book) {
			return true;
		} else {
			return (this.name.equals(book.name) && this.age == book.age);
		}
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
}