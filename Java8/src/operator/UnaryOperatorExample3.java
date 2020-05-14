package operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample3 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 9);

		UnaryOperator<Integer> unaryOperator = a -> a * a;

		list.forEach(x -> System.out.println(x));
		
		List<Integer> newList = newList(unaryOperator, list);
		System.out.println(newList);

	}

	private static List<Integer> newList(UnaryOperator<Integer> unaryOperator, List<Integer> li) {

		List<Integer> newList = new ArrayList<Integer>();
		li.forEach(a -> newList.add(unaryOperator.apply(a)));
		return newList;

	}

}
