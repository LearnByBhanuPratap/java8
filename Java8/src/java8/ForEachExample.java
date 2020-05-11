package java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		ArrayList<Person> data = new ArrayList<>();
		data.add(new Person("A"));
		data.add(new Person("B"));
		data.add(new Person("C"));
		data.add(new Person("D"));
		
		Iterator<Person> itr = data.iterator();
		while(itr.hasNext()) {
			
			itr.next();
			
		}
		
		System.out.println(data);

		data.forEach(new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				data.add(new Person("123"));
				System.out.println(t);
			}

		});
		
		System.out.println(data);
	}
}