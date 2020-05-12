package comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	static Comparator<Person4> nameComparator1 = (o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName());

	static Comparator<Person4> nameComparator2 = Comparator.comparing(e -> e.getFirstName());

	public static void main(String[] args) {

		ArrayList<Person4> arrayList = new ArrayList<Person4>();

		arrayList.add(new Person4("CC", "ZZ", 200, 65.9, new Employee4(900, "HR")));
		arrayList.add(new Person4("AA", "BB", 10, 9.9, new Employee4(100, "Admin")));
		arrayList.add(null);
		arrayList.add(new Person4("BB", "FF", 90, 7.0, new Employee4(1000, "Engineer")));
		arrayList.add(null);


		
		Collections.sort(arrayList, nameComparator2);
		for (Person4 str : arrayList) {
			System.out.println(str.getFirstName());
		}
		System.out.println("-------");
		Collections.sort(arrayList, nameComparator2.reversed());
		
		for (Person4 str : arrayList) {
			System.out.println(str.getFirstName());
		}
		

		List<String> strList = Arrays.asList("AA", "BB", "CC", "DD");
		
		Collections.sort(strList, Comparator.reverseOrder());
		
		System.out.println(strList);
		
		
		Collections.sort(arrayList, Comparator.nullsFirst(nameComparator2));

		System.out.println(arrayList);

		Collections.sort(arrayList, Comparator.nullsLast(nameComparator2));

		System.out.println(arrayList);

		Collections.sort(strList, Comparator.naturalOrder());
		System.out.println(strList);


	}

}

class Person4 {

	private String firstName;

	private Integer age;

	private String lastName;

	private Employee4 Employee4;

	private Double weight;
	
	Person4(){
		
	}

	public Person4(String firstName, String lastName, int age, Double weight, Employee4 Employee4) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.weight = weight;
		this.Employee4 = Employee4;
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

	public Employee4 getEmployee() {
		return Employee4;
	}

	public void setEmployee(Employee4 Employee4) {
		this.Employee4 = Employee4;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person4 [firstName=" + firstName + ", age=" + age + ", lastName=" + lastName + ", Employee4="
				+ Employee4 + ", weight=" + weight + "]";
	}

}

class Employee4  {

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

	public Employee4(int salary, String designation) {
		super();
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Employee4 [salary=" + salary + ", designation=" + designation + "]";
	}

}

