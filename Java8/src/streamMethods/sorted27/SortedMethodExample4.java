package streamMethods.sorted27;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import streamMethods.Employee;

public class SortedMethodExample4 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("AA", 11));
		set.add(new Employee("CC", 15));
		set.add(new Employee("DD", 9));
		set.add(new Employee("BB", 9));

		Function<Employee, String> function2 = a -> a.getName();
		Function<Employee, Integer> function3 = a -> a.getAge();
		
		
		System.out.println("==================");
		// it will throw Exception,because set has Employee object with duplicate data
		
		//Map<String, Integer> map1 = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toMap(function2, function3));
		//System.out.println(map1);
		
	    System.out.println("==================");
		
		Map<String, Integer> map1 = set.stream().sorted()
				.collect(Collectors.toMap(function2, function3, (o1,o2) ->o1+o2));
		
		System.out.println(map1);
		
        System.out.println("==================");
		
		Map<String, Integer> map2 = set.stream().sorted()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toMap(Employee::getName, Employee::getAge, (o1,o2) ->o1+o2));
		
		System.out.println(map2);
		
		
		System.out.println("==================");
		Set<Employee> set45 = set.stream().sorted()
				.collect(Collectors.toSet());
		
		System.out.println(set45);
	}

}
