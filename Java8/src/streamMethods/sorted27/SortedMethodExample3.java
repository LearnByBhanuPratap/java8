package streamMethods.sorted27;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamMethods.Employee;

public class SortedMethodExample3 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Ram", 11));
		set.add(new Employee("Mohan", 15));
		set.add(new Employee("Sohan", 9));
		set.add(new Employee("Sohan", 9));

		
		Set<Employee> setData = set.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
		
		setData.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
		System.out.println("==================");
		
		Map<String, Integer> map = Employee.getListOfEmployees()
				.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toMap(a -> a.getName(), a -> a.getAge()));
		
		System.out.println(map);
		
	}

}
