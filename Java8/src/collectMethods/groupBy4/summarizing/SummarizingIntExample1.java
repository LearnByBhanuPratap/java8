package collectMethods.groupBy4.summarizing;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummarizingIntExample1 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not
	 * understand because each video required previous concept
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Apple");
		list.add("Papaya");
		list.add("Banana");
		list.add("Orange");
		list.add("Orange");
		list.add("Orange");

		IntSummaryStatistics output1 = list.stream().collect(Collectors.summarizingInt(x -> x.length()));

		System.out.println(output1);
		System.out.println(output1.getAverage());
		System.out.println(output1.getMax());
		System.out.println(output1.getSum());
		System.out.println(output1.getMin());
	}
}
