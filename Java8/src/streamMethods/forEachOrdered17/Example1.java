package streamMethods.forEachOrdered17;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		list.stream().parallel().forEach(System.out::println); 

		System.out.println("-------");
		
		list.stream().parallel().forEachOrdered(System.out::println);
	}

}
