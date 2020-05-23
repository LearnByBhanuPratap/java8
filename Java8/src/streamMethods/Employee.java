package streamMethods;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{

	private String name;
	private int age;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Employee() {
	}
	
	public Employee(int id, String name, int age) {
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public void printDeatils(Employee student) {
		System.out.println("name=" + student.getName() + " age" + student.getAge());
	}

	public void printDeatils(int id, Employee student) {
		System.out.println("key=" + id + "name=" + student.getName() + " age=" + student.getAge());
	}

	public void printDeatils() {
		System.out.println("name=" + getName() + " age" + getAge());
	}
	
	public static List<Employee> getListOfEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Test1", 40));
		list.add(new Employee("Test5", 50));
		list.add(new Employee("Test3", 30));
		list.add(new Employee("Test2", 20));
		list.add(new Employee("Test4", 10));
		return list;
	}
	
	public static List<String> getListOfEmployees_1(){
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("BB");
		return list;
	}

	@Override
	public int compareTo(Employee o) {
		return name.compareTo(o.getName());
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}

}