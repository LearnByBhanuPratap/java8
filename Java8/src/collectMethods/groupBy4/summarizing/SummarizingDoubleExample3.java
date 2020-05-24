package collectMethods.groupBy4.summarizing;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
/**
 * https://www.youtube.com/user/MrBhanupratap29/playlists?
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class SummarizingDoubleExample3 {
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

		DoubleSummaryStatistics output1 = list.stream().collect(Collectors.summarizingDouble((x -> x.length())));

		System.out.println(output1);
		
		System.out.println(output1.getAverage());
		System.out.println(output1.getMax());
		System.out.println(output1.getSum());
		System.out.println(output1.getMin());
	}
}
