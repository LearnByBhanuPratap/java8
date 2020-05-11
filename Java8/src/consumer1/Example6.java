package consumer1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example6 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(8, 7, 12, 17, 14, 13);
		
		Number number = new Number();
		
		Consumer<List<Integer>> oddNumberConsumer = number::printOddNumber;
		
		Consumer<List<Integer>> printEvenNumber = Number::printEvenNumber;
		
		Consumer<List<Integer>> doneConsumer = number::done;
		
		oddNumberConsumer.andThen(printEvenNumber).andThen(doneConsumer).accept(list);
	}
}

class Number {

	Consumer<Integer> consumer = n -> {
		if (n % 2 == 1) {
			System.out.println(n + " ");
		}
	};

	static Consumer<Integer> consumer1 = n -> {
		if (n % 2 == 0) {
			System.out.println(n + " ");
		}
	};

	void printOddNumber(List<Integer> li) {
		System.out.println("in printOddNumber");
		li.forEach(n -> {
			if (n % 2 == 1) {
				System.out.println(n + " ");
			}
		});
	}

	static void printEvenNumber(List<Integer> li) {
		System.out.println("in printEvenNumber");
		li.forEach(consumer1);
	}

	void done(List<Integer> li) {
		System.out.println("processing done");
	}
}
