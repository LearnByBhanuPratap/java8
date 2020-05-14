package streamMethods;

import java.util.Arrays;
import java.util.List;

public class FilterMethodExample1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Test1", "", "Test3", "", "Test5", "Test3");
		
		long count = list.stream().filter(x -> x.isEmpty()).count();
		System.out.println(count);
		
		count = list.stream().filter(x -> !x.isEmpty()).count();
		System.out.println(count);
		

	}
}
