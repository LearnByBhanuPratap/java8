package collectMethods.groupBy4.summarizing;

import java.util.ArrayList;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class SummarizingDoubleExample2 {
	/**
	 * Important Note: Please watch video in sequence otherwise you will not
	 * understand because each video required previous concept
	 */
	public static void main(String[] args) {
		List<Long> list = new ArrayList<Long>();
		list.add(7565875l);
		list.add(7565876l);
		list.add(7565876l);
		list.add(7565876l);
		list.add(7565876l);
		list.add(7565876l);
		list.add(7565879l);

		LongSummaryStatistics output1 = list.stream().collect(Collectors.summarizingLong((x -> x)));

		System.out.println(output1);
		
	
		
		System.out.println(output1.getAverage());
		System.out.println(output1.getMax());
		System.out.println(output1.getSum());
		System.out.println(output1.getMin());
	}
}
