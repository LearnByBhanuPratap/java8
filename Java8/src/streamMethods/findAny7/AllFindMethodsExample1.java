package streamMethods.findAny7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import streamMethods.Student;

public class AllFindMethodsExample1 {
	
	static Comparator<Student> comparator = Comparator.comparing(Student::getName);

	public static void main(String[] args) {

		List<String> list = Arrays.asList("AA", "BB", "CC");
		
		list.stream().filter(x ->x.contains("CC")).findAny().ifPresent(s -> System.out.println(s));
		
		list.stream().findAny().ifPresent(s -> System.out.println(s));
		
		list.stream().findAny().get();
		
		System.out.println(list.stream().findFirst().get());
		
		System.out.println("-----max example--------");
		List<Student> list2 = Student.getListOfStudents();
		Optional<Student> max = list2.stream().max(comparator);
		System.out.println(max.get().getName() +" "+ max.get().getAge());
		
		System.out.println("-----min example--------");
		list2 = Student.getListOfStudents();
		Optional<Student> min = list2.stream().min(comparator);
		System.out.println(min.get().getName() +" "+ min.get().getAge());
		
		System.out.println("-----limit example--------");
		List<Student> list3 = Student.getListOfStudents();
		Stream<Student> limit = list3.stream().limit(4);
		limit.forEach(x -> System.out.println(x.getName()+" "+x.getAge()));
		
		
	}
}
