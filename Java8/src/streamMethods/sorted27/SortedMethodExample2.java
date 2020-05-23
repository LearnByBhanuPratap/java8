package streamMethods.sorted27;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import streamMethods.Employee;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class SortedMethodExample2 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(1, "Ram", 11));
		set.add(new Employee(2, "Mohan", 15));
		set.add(new Employee(3, "Sohan", 7));
		set.add(new Employee(4, "Sohan", 7));

		set.stream().sorted()
				.forEach(e -> System.out.println("getId:" + e.getId() 
				+ ", getName: " + e.getName() + ", getAge:" + e.getAge()));

		System.out.println("---------");
		set.stream().sorted(Comparator.reverseOrder())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " 
		+ e.getName() + ", getAge:" + e.getAge()));

		System.out.println("---------");
		set.stream().sorted(Comparator.comparing(Employee::getAge))
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + 
		e.getName() + ", getAge:" + e.getAge()));

		System.out.println("---------");
		set.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + 
		e.getName() + ", getAge:" + e.getAge()));
		
	}

}
