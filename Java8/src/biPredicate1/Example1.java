package biPredicate1;

import java.util.function.BiPredicate;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	static BiPredicate<String, Integer> biPredicate = (a, b) -> {
		return a.length() == b;
	};

	public static void main(String[] args) {
		System.out.println(biPredicate.test("hellojava8", 10));
		System.out.println(biPredicate.test("hellojava8", 9));
		
	}

}
