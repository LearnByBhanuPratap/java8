package streamMethods.collect3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMethodExample1 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("DD");
		list.add("CC");
		list.add("ADDDA");
		list.add("AA");
		list.add("");
		list.add("");
		list.add("BB");

		System.out.println(list);
		List<String> filteredList = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println(filteredList);

		Set<String> filteredSet = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toSet());
		System.out.println(filteredSet);

		LinkedList<String> linkedList = list.stream().filter(x -> !x.isEmpty())
				.collect(Collectors.toCollection(LinkedList::new));
		System.out.println(linkedList.getFirst());

		Collection<String> treeSet = list.stream().filter(x -> !x.isEmpty())
				.collect(Collectors.toCollection(TreeSet::new));
		System.out.println(treeSet);

		Map<Object, Object> map = list.stream().filter(x -> !x.isEmpty()).collect(Collectors.toMap(k -> k, k -> k));
		System.out.println(map);

	}

}
