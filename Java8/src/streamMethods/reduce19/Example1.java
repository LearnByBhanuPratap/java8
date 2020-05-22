package streamMethods.reduce19;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import streamMethods.Student;

public class Example1 {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("AAAAA", "BB", "CC", "DD", "EE");

		Optional<String> longestString = words.stream()
				.reduce((a, b) -> a.length() > b.length() ? a : b);
		
		System.out.println(longestString.get());
	}
}
