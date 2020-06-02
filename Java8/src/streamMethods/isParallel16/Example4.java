package streamMethods.isParallel16;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example4 {

	public static void main(String[] args) {
	
		List<String> list = new ArrayList<String>();
		
		Stream<String> stream = list.stream().parallel();
		
		for (int i = 0; i < 30; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("-------Running sequential-------");

		run(list.stream().sequential());

		System.out.println("-------Running parallel-------");

		run(list.stream().parallel());

		System.out.println("-------Running parallel1-------");

		//run(list.stream().parallel());
	}

	public static void run(Stream<String> stream) {

		stream.forEach(s -> {
			System.out.println(LocalTime.now() + " - value: " + s + " - thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
	}

}