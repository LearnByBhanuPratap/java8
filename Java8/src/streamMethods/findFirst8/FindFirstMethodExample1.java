package streamMethods.findFirst8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import streamMethods.Student;

public class FindFirstMethodExample1 {

	Predicate<String> predicate = x -> x.contains("B");
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("DD");
		list.add("CC");
		list.add("ADDDA");
		list.add("AA");
		list.add("");
		list.add("");
		list.add("BB");

		Optional<String> result = list.stream().findFirst();
		
		System.out.println(result.get()); //DD

		result = list.stream().filter(x -> x.contains("B")).findFirst();

		System.out.println(result.get());
		
		Student student = Student.getListOfStudents().stream().filter(x -> x.getAge()>20).findFirst().get();
		
		System.out.println(student.getAge());

	}

}
