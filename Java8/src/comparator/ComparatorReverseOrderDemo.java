package comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorReverseOrderDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(12, 10, 15, 8, 11);
		Collections.sort(numList, Comparator.reverseOrder());
		numList.forEach(n -> System.out.print(n + " "));
		System.out.println("\n-----------");

		List<String> strList = Arrays.asList("Varanasi", "Allahabad", "Kanpur", "Noida");
		Collections.sort(strList, Comparator.reverseOrder());
		strList.forEach(s -> System.out.print(s + " "));
		System.out.println("\n-----------");

		List<Student> stdList = Student.getStudentList();
		
		//Collections.sort(stdList, Comparator.reverseOrder());
		//stdList.forEach(s -> System.out.print(s.getName() + " "));
	}
}