package consumer;

import java.util.function.Consumer;

public class ConsumerExample8 {
	
	Consumer<Citizen> consumer = c -> {
		if (c.getAge() < 18) {
			System.out.println(c.getName() + " not eligible to vote.");
		} else {
			System.out.println(c.getName() + " eligible to vote.");
		}
	};

	
	public static void main(String[] args) {
		ConsumerExample8 electionConsumer = new ConsumerExample8();

		electionConsumer.consumer.accept(new Citizen("Ram", 15));

		electionConsumer.consumer.accept(new Citizen("Mohan", 20));
	}
}

class Citizen {
	private String name;
	private int age;

	public Citizen(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}