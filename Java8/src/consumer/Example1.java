package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example1 {
	
	static Consumer<Integer> consumer = a ->System.out.println(a);
	
	static Consumer<Integer> consumer1 = a ->System.out.println(a*a);
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		Consumer<Integer> consumer2 = a -> {
			list1.add(a);
		};
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.forEach(consumer);
		list.forEach(consumer1);
		
		list.forEach(consumer2);
		
		System.out.println(list1);
	}
	

}
