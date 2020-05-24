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
public class Example4 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	static Comparator<Person1> ComparatorByFirstName = Comparator.comparing(Person1::getFirstName);

	static Comparator<Person1> comparatorByLastname = Comparator.comparing(Person1::getFirstName);

	static Comparator<Person1> comparingDouble = Comparator.comparingDouble(Person1::getWeight);

	static Comparator<Person1> comparatorByAge = Comparator.comparingInt(Person1::getAge);

	static Comparator<Person1> comparatorByLong = Comparator.comparingLong(e -> e.getAge());
	
	static Comparator<Person1> ComparatorByFirstName2 =
			Comparator.comparing(Person1::getFirstName).thenComparing(Person1::getLastName);
	
	static Comparator<Person1> ComparatorByFirstName3 =
			Comparator.comparing(Person1::getFirstName).thenComparing(Person1::getLastName).thenComparing(Person1::getAge);
	
	static Comparator<Person1> ComparatorByFirstName4 = 
			Comparator.comparing(Person1::getEmployee).thenComparing(Person1::getAge).thenComparing(Person1::getFirstName);
	
	
	public static void main(String[] args) {

		ArrayList<Person1> arrayList = new ArrayList<Person1>();

		arrayList.add(new Person1("CC", "BB", 200, 65.9, new Employee1(900, "HR")));
		arrayList.add(new Person1("AA", "FF", 10, 9.9, new Employee1(100, "Admin")));
		arrayList.add(new Person1("BB", "CC", 99, 7.0, new Employee1(1000, "Engineer")));
		arrayList.add(new Person1("BB", "CC", 90, 7.0, new Employee1(1000, "Engineer")));
		arrayList.add(new Person1("BB", "AA", 91, 7.0, new Employee1(1000, "Engineer")));
		
		Collections.sort(arrayList, Comparator.comparing(Person1::getFirstName));
		
		Collections.sort(arrayList, Comparator.comparing(Person1::getFirstName).thenComparing(Person1::getAge));
		
		
	}

}

class Person1 {

	private String firstName;

	private Integer age;

	private String lastName;

	private Employee1 Employee1;

	private Double weight;

	public Person1(String firstName, String lastName, int age, Double weight, Employee1 Employee1) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.Employee1 = Employee1;
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

	public Employee1 getEmployee() {
		return Employee1;
	}

	public void setEmployee(Employee1 Employee1) {
		this.Employee1 = Employee1;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person1 [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + ", Employee1="
				+ Employee1 + ", weight=" + weight + "]";
	}

}

class Employee1 implements Comparable<Employee1>{

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

	public Employee1(int salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee1 [salary=" + salary + ", designation=" + designation + "]";
	}

	@Override
	public int compareTo(Employee1 o) {
		return designation.compareTo(o.getDesignation());
	}
}
