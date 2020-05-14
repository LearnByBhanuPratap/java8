package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example2 {

	static Consumer<List<Person1>> nameConsumer = person -> {
		for (Person1 li : person) {
			if (li.getName().contains("Ram")) {
				li.setName(li.getName().toUpperCase());
				System.out.println(li);
			} else {
				System.out.println(li);
			}
		}

	};

	static Consumer<List<Person1>> ageConsumer = person -> {
		for (Person1 li : person) {
			if (li.getAge() == 20) {
				li.setAge(li.getAge() + 20);
				System.out.println(li);
			} else {
				System.out.println(li);
			}
		}

	};

	public static void main(String[] args) {
		List<Person1> list = new ArrayList<Person1>();
		list.add(new Person1("Ram", 10));
		list.add(new Person1("Mohan", 20));
		list.add(new Person1("Sohan", 30));
		
		nameConsumer.accept(list);
		ageConsumer.accept(list);
	}
}

class Person1 {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
