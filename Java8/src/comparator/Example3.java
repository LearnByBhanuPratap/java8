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
public class Example3 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	static Comparator<Person2> ComparatorByFirstName = Comparator.comparing(Person2::getFirstName);

	static Comparator<Person2> comparatorByLastname = Comparator.comparing(Person2::getLastName);

	static Comparator<Person2> comparingDouble = Comparator.comparingDouble(Person2::getWeight);

	static Comparator<Person2> comparatorByAge = Comparator.comparingInt(Person2::getAge);

	static Comparator<Person2> comparatorByLong = Comparator.comparingLong(e -> e.getAge());

	static Comparator<Person2> employeeSalaryComparator = Comparator.comparing(Person2::getEmployee,
			(o1, o2) -> o1.getSalary().compareTo(o2.getSalary()));


	static Comparator<Person2> employeeSalaryComparator1 = Comparator.comparingInt(e -> e.getEmployee().getSalary());

	static Comparator<Person2> employeeSalaryComparator10 = Comparator.comparing(Person2::getLastName)
			.thenComparing(Person2::getFirstName);

	static Comparator<Person2> employeeSalaryComparator2 = Comparator.comparingDouble(e -> e.getEmployee().getSalary());

	static Comparator<Person2> comparingLong = Comparator.comparingLong(e -> e.getEmployee().getSalary());

	static Comparator<Person2> employeeDesignationComparator = Comparator
			.comparing(e -> e.getEmployee().getDesignation());

	static Comparator<Person2> employeeDesignationComparator1 = Comparator.comparing(e -> e.getEmployee(), (o1, o2) -> {
		return o1.getDesignation().compareTo(o2.getDesignation());
	});

	static Comparator<Person2> employeeDesignationComparator2 = Comparator.comparing(e -> e.getEmployee(),
			(o1, o2) -> o1.getDesignation().compareTo(o2.getDesignation()));

	public static void main(String[] args) {

		ArrayList<Person2> arrayList = new ArrayList<Person2>();

		arrayList.add(new Person2("CC", "BB", 200, 65.9, new Employee2(900, "HR")));
		arrayList.add(new Person2("AA", "FF", 10, 9.9, new Employee2(100, "Admin")));
		arrayList.add(new Person2("BB", "CC", 99, 7.0, new Employee2(1000, "Engineer")));
		arrayList.add(new Person2("BB", "CC", 90, 7.0, new Employee2(1000, "Engineer")));
		arrayList.add(new Person2("BB", "AA", 91, 7.0, new Employee2(1000, "Engineer")));

		Collections.sort(arrayList, Comparator.comparing(Person2::getFirstName));
		
		Collections.sort(arrayList, Comparator.comparing(Person2::getFirstName).thenComparing(Person2::getAge));

		
		Comparator<Person2> employeeSalaryComparator1 = Comparator.comparing(Person2::getEmployee);

	}

}

class Person2 {

	private String firstName;

	private Integer age;

	private String lastName;

	private Employee2 Employee2;

	private Double weight;
	
	Person2(){
		
	}

	public Person2(String firstName, String lastName, int age, Double weight, Employee2 Employee2) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.Employee2 = Employee2;
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

	public Employee2 getEmployee() {
		return Employee2;
	}

	public void setEmployee(Employee2 Employee2) {
		this.Employee2 = Employee2;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person2 [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + ", Employee2="
				+ Employee2 + ", weight=" + weight + "]";
	}

}

class Employee2 implements Comparable<Employee2>{

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

	public Employee2(int salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee2 [salary=" + salary + ", designation=" + designation + "]";
	}

	@Override
	public int compareTo(Employee2 o) {
		// TODO Auto-generated method stub
		return designation.compareTo(o.getDesignation());
	}
}
