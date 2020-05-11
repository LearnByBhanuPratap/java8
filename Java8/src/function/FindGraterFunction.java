package function;

import java.util.function.Function;

public class FindGraterFunction {

	static Function<Integer, Boolean> grater = (age) -> (age > 30);

	public static void main(String[] args) {
		System.out.println(grater.apply(90)); // true
		System.out.println(grater.apply(10)); // false
	}

}
