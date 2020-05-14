package lambda;

public class Example2 {

	FIExample add = (int a, int b) -> {
		return a + b;
	};

	FIExample multiply = (int a, int b) -> {
		return a * b;
	};

	FIExample subsctract = (int a, int b) -> {
		return a - b;
	};

	FIExample add1 = (a, b) -> {
		return a + b;
	};

	FIExample multiply1 = (a, b) -> {
		return a * b;
	};

	FIExample subsctract1 = (a, b) -> {
		return a - b;
	};

	FIExample add2 = (a, b) -> a + b;

	FIExample multiply2 = (a, b) -> a * b;

	FIExample subsctract2 = (a, b) -> a - b;

	public static void main(String[] args) {
		Example2 example2 = new Example2();
		System.out.println(example2.add1.operation(2, 3));
		System.out.println(example2.multiply.operation(2, 3));
		System.out.println(example2.subsctract2.operation(2, 3));
	}

}
