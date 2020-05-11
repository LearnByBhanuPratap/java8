package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample6 {

	Consumer<List<Employee>> consumer = (list) -> {
		for (Employee li : list) {
			if (li.getAge() > 19) {
				System.out.println(li);
			}
		}
	};

	public static void main(String[] args) {

		ConsumerExample6 example4 = new ConsumerExample6();

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Test1", 10));
		list.add(new Employee("Test1", 20));
		list.add(new Employee("Test1", 30));

		example4.consumer.accept(list);

	}
}

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
