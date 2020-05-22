package streamMethods.flatMap9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example2 {

	public static void main(String[] args) {
		
		String[][] d = { { "A", "Apple" }, { "B", "Banana" }, { "O", "Orange" } };

		
		Stream<String[]> data = 
				Stream.of(new String[][] { { "A", "Apple" }, { "B", "Banana" }, { "O", "Orange" } });
		
		Stream<String[]> data2 = 
				Stream.of(new String[][] { { "P", "Papaya" }, { "C", "Coconut" }, { "O", "Orange" } });
		
		Stream<Stream<String[]>> data3 = Stream.of(data,data2);
		
		
		data3.forEach(x->{
			x.forEach(y ->{
				System.out.println(y[0]+" "+y[1]);
			});
		});
		
		Stream<Stream<String[]>> data4 = data3;
				
		List<String[]> finalData = data4.flatMap(x ->x).collect(Collectors.toList());
		
		finalData.forEach(x->{
			System.out.println(x[0]+" "+x[1]);
		});
		
	}

}
