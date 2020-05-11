package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	// old way
	Comparator<Person> comparable = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	};

	// in java 8
	Comparator<Person> nameComparator = (Person o1, Person o2) -> o1.getFirstName().compareTo(o2.getFirstName());

	Comparator<Person> nameComparator1 = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());

	Comparator<Person> compareByFirstName = Comparator.comparing(e -> e.getFirstName());

	Comparator<Person> compareByLastName = Comparator.comparing(e -> e.getLastName());

	Comparator<Person> comparingDouble = Comparator.comparingDouble(k -> k.getWeight());
	
	Comparator<Person> comparingInt = Comparator.comparingInt(k -> k.getAge());

	Comparator<Person> compareByEmpSalary = Comparator.comparing(e -> e.getEmployee(),
			(o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));
	
	Comparator<Person> comparingIntEmpSalary = Comparator.comparingInt(e -> e.getEmployee().getSalary());
	
	Comparator<Person> comparingEmpDesignation = Comparator.comparing(e -> e.getEmployee(),(o1, o2) -> o1.getDesignation().compareTo(o2.getDesignation()));
	
	


	public static void main(String[] args) {

		ComparatorExample constructorExample = new ComparatorExample();

		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.add(new Person("CC", "ZZ", 20, 65.9, new Employee(900, "HR")));
		arrayList.add(new Person("AA", "BB", 10, 90.9, new Employee(100, "Admin")));
		arrayList.add(new Person("BB", "FF", 9, 70.0, new Employee(1000, "Engineer")));

		Collections.sort(arrayList, constructorExample.comparingIntEmpSalary);
		// System.out.println(arrayList);

		System.out.println(arrayList);
		
		Collections.sort(arrayList, constructorExample.comparingIntEmpSalary);
		
		Comparator<Person> compareByFirstNameAndAge = Comparator.comparing((Person e) -> e.getFirstName()).thenComparing(e ->e.getAge()).thenComparingInt(e -> e.getAge());
		
		Comparator<Person> compareByFirstNameAndAge1 = Comparator.comparing(Person::getFirstName).thenComparing(e ->e.getAge()).thenComparingInt(e -> e.getAge());
		
		Collections.sort(arrayList, compareByFirstNameAndAge);
		
		System.out.println(arrayList);

		
		
	}

}

class Person {

	private String firstName;

	private Integer age;

	private String lastName;

	private Employee employee;

	private Double weight;

	public Person(String firstName, String lastName, int age, Double weight, Employee employee) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.employee = employee;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + ", employee=" + employee
				+ ", weight=" + weight + "]";
	}

}

class Employee {

	private Integer salary;
	private String designation;

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Employee(int salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + "]";
	}
}
