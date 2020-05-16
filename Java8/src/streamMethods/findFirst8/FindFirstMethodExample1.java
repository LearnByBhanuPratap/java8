package streamMethods.findFirst8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstMethodExample1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("DD");
		list.add("CC");
		list.add("ADDDA");
		list.add("AA");
		list.add("");
		list.add("");
		list.add("BB");

		Optional<String> result = list.stream().findFirst();
		System.out.println(result.get());
		
		result = list.stream().filter(x ->x.contains("B")).findFirst();
		
		System.out.println(result.get());


	}

}
