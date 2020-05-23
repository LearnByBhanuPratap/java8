package streamMethods.reduce19;

import java.util.Arrays;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example6 {

	public static void main(String[] args) {

		int[] array = { 21, 40, 14, 7, 31 };
		
		int startValue = 100;
		
		// IntBinaryOperator
		int sum = Arrays.stream(array).reduce(startValue, (x, y) -> x + y);
		System.out.println(sum);
		
		//IntBinaryOperator
		sum = Arrays.stream(array).reduce(startValue, Integer::sum);
		System.out.println(sum);
		
		sum = Arrays.stream(array).reduce(startValue, Example6::addData);
		System.out.println(sum);
	}

	public static int addData(int num1, int num2) {
		return num1 + num2;
	}

}
