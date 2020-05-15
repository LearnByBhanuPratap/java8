package streamMethods;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SortedMethodExample2 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Ram", 11));
		set.add(new Employee("Mohan", 15));
		set.add(new Employee("Sohan", 9));
		set.add(new Employee("Sohan", 9));

		set.stream().sorted()
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.reverseOrder())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.comparing(Employee::getAge))
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + e.getName() + ", getAge:" + e.getAge()));

		
		set.stream().sorted(Comparator.comparing(Employee::getAge).reversed())
				.forEach(e -> System.out.println("getId:" + e.getId() + ", getName: " + e.getName() + ", getAge:" + e.getAge()));
		
		System.out.println("==================");
		
		// This will work because Employee is of type Comparable
		Set<Employee> setData = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
		
		setData.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
		System.out.println("==================");
		
		// This will work because Employee is of type Comparable
		Map<String, Integer> map = Employee.getListOfEmployees().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toMap(a -> a.getName(), a -> a.getAge()));
		System.out.println(map);
		
		
		Function<Employee, String> function2 = a -> a.getName();
		Function<Employee, Integer> function3 = a -> a.getAge();
		
		
		System.out.println("==================");
		// it will throw Exception,because set has Employee object with duplicate data
		
		//Map<String, Integer> map1 = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toMap(function2, function3));
		//System.out.println(map1);
		
	    System.out.println("==================");
		
		Map<String, Integer> map1 = set.stream().sorted().collect(Collectors.toMap(function2, function3, (o1,o2) ->o1+o2));
		System.out.println(map1);
		
        System.out.println("==================");
		
		Map<String, Integer> map2 = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toMap(Employee::getName, Employee::getAge, (o1,o2) ->o1+o2));
		System.out.println(map2);
	}

}
