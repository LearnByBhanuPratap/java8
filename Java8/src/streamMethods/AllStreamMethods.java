package streamMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllStreamMethods {
	
	static Predicate<Student>  predicate = a -> a.getName().contains("T");
	
	static Supplier<Student> supplier = Student::new;
	
	static BiConsumer<String, Integer> biConsumer = (a, b) -> System.out.println(a+b);
	
	static Consumer<Integer> consumer = (a) ->System.out.println(a);
	
	static BinaryOperator<Integer> binaryOperator = (a, b) -> a+b;
	
	static BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a+b;
	
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		
		
		List<Student> list = Student.getListOfStudents();
		
		// allMatch(Predicate<? super T> predicate)
		// Returns whether all elements of this stream match the provided predicate.
		list.stream().allMatch(predicate);
		
		// anyMatch(Predicate<? super T> predicate)
		// Returns whether any elements of this stream match the provided predicate.
		list.stream().anyMatch(predicate);
		
		// collect(Collector<? super T,A,R> collector)
		// Performs a mutable reduction operation on the elements of this stream using a Collector.
		list.stream().collect(Collectors.toList());
		
		// collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
		// Performs a mutable reduction operation on the elements of this stream.
		list1.stream().collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		// Returns the count of elements in this stream.
		// count()
		list.stream().count();
		
		// distinct()
		// Returns a stream consisting of the distinct elements 
		// (according to Object.equals(Object)) of this stream.
		list.stream().distinct();
		
		list.stream().filter(predicate);
		
		list.stream().findAny();
		
		list.stream().findFirst();
		
		List<List<Integer>> list3 = new ArrayList<List<Integer>>();
		list3.add(list1);
		list3.add(list2);
		
		Stream<Object> newFlatMap = list3.stream().flatMap( x -> x.stream());
		
		list3.stream().flatMapToDouble(x -> x.stream().mapToDouble(Double::new));
		
		list3.stream().flatMapToInt(x -> x.stream().mapToInt(Integer::new));
		
		list3.stream().flatMapToLong(x -> x.stream().mapToLong(Long::new));
		
		list.stream().max(Comparator.comparing(Student::getAge));
		
		list.stream().min(Comparator.comparing(Student::getAge));
		
		list1.stream().forEach(consumer);
		
		list1.stream().forEachOrdered(consumer);
		
		list.stream().isParallel();
		
		list1.stream().peek(consumer);
		
		list1.stream().reduce(binaryOperator);
		
		list1.stream().limit(3);
		
		
		list3.stream().map(x ->x.stream());
		
		ToDoubleFunction<Integer> doubleFunction = (a) ->Double.valueOf(a);
		list1.stream().mapToDouble(doubleFunction);

		list1.stream().mapToInt((a) ->Integer.valueOf(a));
		
		list1.stream().mapToLong((a) ->Long.valueOf(a));
		
		list1.stream().reduce(binaryOperator);
		
		list1.stream().reduce(10, binaryOperator);
		
		list1.stream().reduce(10, biFunction, binaryOperator);
		
		list1.stream().sequential();
		
		list1.stream().sorted();
		
		list1.stream().unordered();
		
		list1.stream().skip(10);
		
		list1.stream().parallel();
	}

}
