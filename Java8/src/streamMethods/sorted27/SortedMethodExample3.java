package streamMethods.sorted27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamMethods.Employee;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class SortedMethodExample3 {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		set.add(new Employee("Ram", 11));
		set.add(new Employee("Mohan", 15));
		set.add(new Employee("Sohan", 7));
		set.add(new Employee("Sohan", 7));

		
		Set<Employee> setData = set.stream()
				.sorted(Comparator.reverseOrder()).collect(Collectors.toSet());
		
		setData.forEach(a -> System.out.println(a.getName()+" "+a.getAge()));
		
		System.out.println("==================");
		
		Map<String, Integer> map = Employee.getListOfEmployees()
				.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toMap(a -> a.getName(), a -> a.getAge()));
		
		System.out.println(map);
		
		Stream<Employee> setData1 = Employee.getListOfEmployees().stream().sorted(Comparator.reverseOrder());
		
		System.out.println(setData1.collect(Collectors.toList()));
		
	}
	
	public static List<Employee> getListOfEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Test1", 40));
		list.add(new Employee("Test5", 50));
		list.add(new Employee("Test3", 30));
		list.add(new Employee("Test2", 20));
		list.add(new Employee("Test4", 10));
		return list;
	}

}
