package streamMethods.map21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamMethods.Student;

public class Example1 {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();
		
		Stream<Double> newList = list.stream().map(x -> Double.valueOf(x.getAge()));
		
		System.out.println(newList.collect(Collectors.toList()));
		
		
		List<String> list1 = Student.getListOfStudents_1();
		
		Stream<String> newList1 = list1.stream().map(x -> String.valueOf(x));
		
		System.out.println(newList1.collect(Collectors.toList()));
		
	}

}
