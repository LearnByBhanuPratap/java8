package streamMethods.flatMap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(20, 11, 28, 54, 51);
		
		list1.stream();
		
		List<Integer> list2 = Arrays.asList(10, 11, 15, 14, 25);
		
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		
		list.add(list1);
		list.add(list2);
		
		
		
		System.out.println(list);
		
		//list.stream().flatMap(li ->li.stream());
		
		Stream<Object> flatMap = list.stream().flatMap(li -> li.stream());
		
		//List<Object> newList = flatMap.collect(Collectors.toList());
		
		System.out.println(flatMap.collect(Collectors.toList()));
		
		
	}

}
