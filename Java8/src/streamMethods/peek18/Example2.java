package streamMethods.peek18;

import java.util.stream.Stream;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example2 {

	public static void main(String[] args) {
		
		Stream<User> userStream = Stream.of(new User("AA"), new User("BB"), new User("CC"));
		
		userStream.peek(u -> u.setName(u.getName().toLowerCase())).forEach(System.out::println);
	}

}
