package operator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample2 {

	Comparator<Integer> comparator = new Comparator<Integer>() {

		@Override
		public int compare(Integer o1, Integer o2) {

			return o1.compareTo(o2);
		}
	};

	Comparator<Integer> comparator1 = (Integer o1, Integer o2) -> {
		return o1.compareTo(o2);
	};

	Comparator<Integer> comparator2 = (o1, o2) -> (o1.compareTo(o2));

	public static void main(String[] args) {

		Comparator<Integer> comparator = (a, b) -> (a.compareTo(b));

		BinaryOperator<Integer> opMax = BinaryOperator.maxBy(comparator);
		System.out.println(opMax.apply(5, 90));
		System.out.println(opMax.apply(90, 60));

		System.out.println("--------");
		BinaryOperator<Integer> opMin = BinaryOperator.minBy(comparator);
		System.out.println(opMin.apply(50, 90));
		System.out.println(opMin.apply(90, 60));

	}
}
