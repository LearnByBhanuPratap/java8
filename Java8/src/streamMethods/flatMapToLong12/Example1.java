package streamMethods.flatMapToLong12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example1 {


	// Always watch Video in sequence otherwise you will loose concept
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);

		List<Integer> list2 = Arrays.asList(10, 11, 15, 14, 25);

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list.add(list1);
		list.add(list2);
		
		Stream<List<Integer>> stream;
		
		System.out.println(list);
		LongStream intData = list.stream().flatMapToLong(x -> x.stream().mapToLong(y ->y*2));
		
		
		List<Long> listData = intData.boxed().collect(Collectors.toList());
		
		System.out.println(listData);
		
	}

}
