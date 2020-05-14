package biPredicate;

import java.util.function.BiPredicate;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example3 {
	


	public static void main(String[] args) {
		BiPredicate<Integer, String> conditions = (a, b) -> a > 30 && b.startsWith("R");
		BiPredicate<Integer, String> conditions1 = (a, b) -> a < 30 && b.startsWith("T");
		
		System.out.println(conditions.test(20, "Test1"));
		System.out.println(conditions.test(30, "RTest2"));
		System.out.println(conditions.test(50, "Test3"));
		System.out.println("------");
		System.out.println(conditions.negate().test(20, "Test1"));
		System.out.println(conditions.negate().test(30, "RTest2"));
		System.out.println(conditions.negate().test(50, "Test3"));
		
		System.out.println("------");
		System.out.println(conditions.or(conditions1).test(20, "Test1"));
		System.out.println(conditions.or(conditions1).test(30, "RTest2"));
		System.out.println(conditions.or(conditions1).test(50, "Test3"));
		
		System.out.println("------");
		System.out.println(conditions.and(conditions1).test(20, "Test1"));
		System.out.println(conditions.and(conditions1).test(30, "RTest2"));
		System.out.println(conditions.and(conditions1).test(50, "Test3"));
	}
}
