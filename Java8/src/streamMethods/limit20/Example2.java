package streamMethods.limit20;

import java.util.List;

import streamMethods.Student;

public class Example2 {

	public static void main(String[] args) {
		
		List<Student> list = Student.getListOfStudents();

		list.stream().limit(3).forEach(x ->System.out.println(x.getName()+" "+x.getAge()));
	}
}
