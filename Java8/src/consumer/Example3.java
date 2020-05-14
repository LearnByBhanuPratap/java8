package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Example3 {

	static Consumer<Person> nameConsumer = person -> {
		if (person.getName().contains("Ram")) {
			person.setName(person.getName().toUpperCase());
			System.out.println(person);
		} else {
			System.out.println(person);
		}
	};
	
	static Consumer<Person> ageConsumer  = person ->{
		if(person.getAge() == 20) {
			person.setAge(person.getAge()+20);
			System.out.println(person);
		}
		else {
			System.out.println(person);
		}
	};
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("Ram", 10));
		list.add(new Person("Mohan", 20));
		list.add(new Person("Sohan", 30));
		
		list.forEach(nameConsumer);
		System.out.println("-------");
		list.forEach(ageConsumer);
	}
}

class Person {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public Person(String name, int age) {
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
