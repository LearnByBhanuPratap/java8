package lamda;

public class Example2 {

	FunctionalInterfaceExample add = (a, b) -> a + b;

	FunctionalInterfaceExample myltiply = (a, b) -> a * b;

	FunctionalInterfaceExample substract = (a, b) -> a - b;

	FunctionalInterfaceExample add1 = (a, b) -> {
		return a + b;
	};

	FunctionalInterfaceExample myltiply1 = (a, b) -> {
		return a * b;
	};

	FunctionalInterfaceExample substract1 = (a, b) -> {
		return a - b;
	};

	public static void main(String[] args) {

		Example2 example2 = new Example2();

		System.out.println(example2.add.operation(4, 5));

		System.out.println(example2.myltiply.operation(4, 5));

		System.out.println(example2.substract.operation(4, 5));
	}

}
