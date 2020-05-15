package streamMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class ForEachMethodExample4 {

	// For Map use BiConsumer
	static BiConsumer<Integer, Student> consumer = (k ,v) -> {
		System.out.println(k+ " "+ v.getName()+" "+ v.getAge());
	};
	
	static BiConsumer<Integer, Student> consumer1 = (k ,v) -> {
		if(v.getName().equalsIgnoreCase("Test1")) {
			System.out.println(k+ " "+ v.getName()+" "+ v.getAge());	
		}
	};

	public static void main(String[] args) {
    
		Student student = new Student();
		
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		
		map.put(1, new Student("Test1", 50));
		map.put(2, new Student("Test2", 52));
		map.put(3, new Student("Test3", 51));
		map.put(4, new Student("Test4", 53));
		
		map.forEach(consumer);
		
		map.forEach(student::printDeatils);
	}
}
