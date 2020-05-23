package streamMethods.map21;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import streamMethods.Student;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {
	
	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();
		
		Stream<Double> newList = list.stream().map(x -> Double.valueOf(x.getAge()));
		
		System.out.println(newList.collect(Collectors.toList()));
		
		
		List<String> list1 = Student.getListOfStudents_1();
		
		Stream<String> newList1 = list1.stream().map(x -> String.valueOf(x));
		
		System.out.println(newList1.collect(Collectors.toList()));
		
	}
	
	public static List<Student> getListOfStudents() {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("Test1", 40));
		list.add(new Student("Test5", 50));
		list.add(new Student("Test3", 30));
		list.add(new Student("Test2", 20));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		list.add(new Student("Test4", 10));
		return list;
	}
	
	public static List<String> getListOfStudents_1() {
		List<String> list = new ArrayList<String>();
		list.add("AA");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("BB");
		return list;
	}

}
