package streamMethods;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
