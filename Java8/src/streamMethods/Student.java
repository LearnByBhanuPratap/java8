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
		System.out.println("key=" + id + "name=" + student.getName() + " age=" + student.getAge());
	}

	public void printDeatils() {
		System.out.println("name=" + getName() + " age" + getAge());
	}
	
	public static List<Student> getListOfStudents(){
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		return list;
	}
	
	public static List<String> getListOfStudents_1(){
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("BB");
		return list;
	}
}