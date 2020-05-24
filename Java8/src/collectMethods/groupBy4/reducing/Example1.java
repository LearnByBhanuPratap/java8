package collectMethods.groupBy4.reducing;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not
	 * understand because each video required previous concept
	 */
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");
		
		BinaryOperator<String> binaryOperator = (a,b) -> a.concat(b);
				
		Optional<String> result = list.stream().collect(Collectors.reducing(binaryOperator));
		
		System.out.println(result.get());
	}

}
