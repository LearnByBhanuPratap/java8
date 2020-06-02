package streamMethods.reduce19;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example7 {
	
	/*
	 Here we will pass three arguments identity, accumulator and combiner in reduce() method.
	 The identity value must be an identity for the combiner function. This method with three
	 arguments is used in parallel processing. Combiner works with parallel stream only, 
	 otherwise there is nothing to combine.
	 */
	
	static BiFunction<Integer, Integer, Integer> biFunction = (a,b) -> a*b;
	
	static BinaryOperator<Integer> binaryOperator = (a ,b) -> a*b;

	public static void main(String[] args) {
		
		List<Integer> list2 = Arrays.asList(3, 2, 2);
		
		//int res = list2.stream().reduce(2, (s1, s2) -> s1 * s2, (p, q) -> p * q);
		
		int res = list2.stream().reduce(2, biFunction, binaryOperator);
		
		// 2*2 = 4
		// 4*2*2 = 16
		// 16*3*2 = 96
		int res1 = list2.parallelStream().reduce(2, biFunction, binaryOperator);
		
		System.out.println(res);
		
		System.out.println(res1);
		
		//System.out.println(binaryOperator.apply(3, 2));
		
		System.out.println("-----");
		list2.parallelStream().forEach(x -> System.out.println(x));
		
		System.out.println("----");
		list2.stream().forEach(x -> System.out.println(x));
		
		
	}

}
