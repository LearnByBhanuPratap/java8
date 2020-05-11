package biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample3 {
	
	public static void main(String[] args) {
		
		BiPredicate<Integer, String> condition = (i, s) -> i > 30 && s.startsWith("R");
		
		BiPredicate<Integer, String> condition1 = (i, s) -> i < 30 && s.startsWith("T");
		
		System.out.println(condition.test(20, "Test1"));
		System.out.println(condition.test(30, "RTest2"));
		System.out.println(condition.test(50, "Test3"));
		System.out.println("--------");
		System.out.println(condition.negate().test(20, "Test1"));
		System.out.println(condition.negate().test(30, "RTest2"));
		System.out.println(condition.negate().test(50, "Test3"));
		
		System.out.println("--------");
		System.out.println(condition.or(condition1).test(20, "Test1"));
		System.out.println(condition.or(condition1).test(30, "RTest2"));
		System.out.println(condition.or(condition1).test(50, "Test3"));
		
		System.out.println("--------");
		System.out.println(condition.and(condition1).test(20, "Test1"));
		System.out.println(condition.and(condition1).test(30, "RTest2"));
		System.out.println(condition.and(condition1).test(50, "Test3"));

	}
}