package streamMethods.collect3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodExample2 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("DD");
		list.add("CC");
		list.add("ADDDA");
		list.add("AA");
		list.add("");
		list.add("");
		list.add("BB");

		String result = list.stream().collect(Collectors.joining(", "));

		System.out.println(result);

		String result1 = list.stream().collect(Collectors.joining("##"));

		System.out.println(result1);

	}

}
