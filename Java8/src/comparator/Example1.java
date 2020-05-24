package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	// old way
	static Comparator<Person> comparator = new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {

			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	};
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	static Comparator<Person> nameComparator = (Person o1, Person o2) -> o1.getFirstName().compareTo(o2.getFirstName());

	static Comparator<Person> nameComparator1 = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());

	static Comparator<Person> nameComparator2 = Comparator.comparing(e -> e.getFirstName());

	static Comparator<Person> comparatorByLastname = Comparator.comparing(e -> e.getLastName());

	static Comparator<Person> comparatorByWeight = Comparator.comparingDouble(e -> e.getWeight());

	static Comparator<Person> comparatorByAge = Comparator.comparingInt(e -> e.getAge());

	static Comparator<Person> comparatorByLong = Comparator.comparingLong(e -> e.getAge());

	static Comparator<Person> employeeSalaryComparator = Comparator.comparing(e -> e.getEmployee(),
			(o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));

	static Comparator<Person> employeeSalaryComparator1 = Comparator.comparingInt(e -> e.getEmployee().getSalary());

	static Comparator<Person> employeeSalaryComparator2 = Comparator.comparingDouble(e -> e.getEmployee().getSalary());

	static Comparator<Person> employeeSalaryComparator3 = Comparator.comparingLong(e -> e.getEmployee().getSalary());

	static Comparator<Person> employeeDesignationComparator = Comparator
			.comparing(e -> e.getEmployee().getDesignation());

	static Comparator<Person> employeeDesignationComparator1 = Comparator.comparing(e -> e.getEmployee(), (o1, o2) -> {
		return o1.getDesignation().compareTo(o2.getDesignation());
	});
	
	static Comparator<Person> employeeDesignationComparator2 = 
			Comparator.comparing(e -> e.getEmployee(), (o1, o2) -> 
		o1.getDesignation().compareTo(o2.getDesignation()));

	public static void main(String[] args) {

		ArrayList<Person> arrayList = new ArrayList<Person>();
		arrayList.add(new Person("CC", "ZZ", 200, 65.9, new Employee(900, "HR")));
		arrayList.add(new Person("AA", "BB", 10, 9.9, new Employee(100, "Admin")));
		arrayList.add(new Person("BB", "FF", 90, 7.0, new Employee(1000, "Engineer")));

		Collections.sort(arrayList, nameComparator);
		System.out.println(arrayList);

		Collections.sort(arrayList, (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));

		Collections.sort(arrayList, employeeSalaryComparator);

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
