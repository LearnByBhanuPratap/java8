package streamMethods.sorted27;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import streamMethods.Employee;

public class SortedMethodExample2 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Ram", 11));
		set.add(new Employee("Mohan", 15));
		set.add(new Employee("Sohan", 9));
		set.add(new Employee("Sohan", 9));

		set.stream().sorted()
				.forEach(e -> System.out.println("getId:" + e.getId() 
				+ ", getName: " + e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.reverseOrder())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " 
		+ e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.comparing(Employee::getAge))
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + 
		e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + 
		e.getName() + ", getAge:" + e.getAge()));
		
	}

}
