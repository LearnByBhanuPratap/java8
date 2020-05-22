package streamMethods.reduce19;

import java.util.List;
import java.util.Optional;
import streamMethods.Student;

public class Example2 {

	public static void main(String[] args) {

		List<String> list = Student.getListOfStudents_1();
		Optional<String> String_combine = list.stream().reduce((str1, str2) -> str1 + "**" + str2);

		if (String_combine.isPresent()) {
			System.out.println(String_combine.get());
		}
	}
}
