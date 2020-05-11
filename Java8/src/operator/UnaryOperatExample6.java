package operator;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;


public class UnaryOperatExample6 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1, 3, 5, 6, 7);
		
		UnaryOperator<Integer> unaryOpt = i -> i * i;
		
		unaryOperatorFun(unaryOpt, list).forEach(x -> System.out.println(x));
	}

	private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
		List<Integer> uniList = new ArrayList<>();
		list.forEach(i -> uniList.add(unaryOpt.apply(i)));
		return uniList;
	}
}