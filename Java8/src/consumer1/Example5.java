package consumer1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example5 {

	static Consumer<Person> ageConsumer = person -> {
		if (person.getAge() > 18) {
			System.out.println(person.getName() + " is eligible for voating");
		} else {
			System.out.println(person.getName() + " not eligible for voating");
		}
	};

	static Consumer<List<Person>> ageConsumer1 = person -> {
		for (Person p : person) {
			if (p.getAge() > 18) {
				System.out.println(p.getName() + " is eligible for voating");
			} else {
				System.out.println(p.getName() + " not eligible for voating");
			}
		}
	};

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Ram", 10));
		list.add(new Person("Mohan", 20));
		list.add(new Person("Sohan", 30));
		
		list.forEach(ageConsumer);
		System.out.println("------");
		ageConsumer1.accept(list);

	}

}
