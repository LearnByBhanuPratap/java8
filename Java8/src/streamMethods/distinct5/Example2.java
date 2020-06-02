package streamMethods.distinct5;

import streamMethods.Student;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	public static void main(String[] args) {

		Student.getListOfStudents().stream().forEach(x -> {
			System.out.println(x.getName()+" "+x.getAge());
		});
		
		System.out.println("----");
		Student.getListOfStudents().stream().distinct().forEach(x -> {
			System.out.println(x.getName()+ " "+x.getAge());
		});
	}

}
