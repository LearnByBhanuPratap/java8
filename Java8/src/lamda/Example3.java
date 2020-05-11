package lamda;

public class Example3 {

	FunctionalInterfaceExample2 message1 = (a) -> {
		a.toUpperCase();
	};

	FunctionalInterfaceExample2 message2 = (a) -> {
		System.out.println(a.toUpperCase());
	};

	public static void main(String[] args) {

		Example3 example2 = new Example3();

		example2.message2.sayMessage("Hello Java");
	}
}
