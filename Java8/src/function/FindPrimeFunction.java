package function;

import java.util.function.Function;

public class FindPrimeFunction {

	static Function<Integer, Integer> isPrimeNumber = (number) -> (number % 2);
	
	public static void main(String[] args) {
		System.out.println(isPrimeNumber.apply(90)); //0
		System.out.println(isPrimeNumber.apply(11)); //1
	}
}
