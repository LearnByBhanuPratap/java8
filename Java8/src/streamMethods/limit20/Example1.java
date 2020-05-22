package streamMethods.limit20;

import java.util.Arrays;
import java.util.List;

public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		list.stream().limit(3).forEach(x ->System.out.println(x));
	}
}
