package lambda1;

public class Example1{

	FunctionalInterfaceExample1 functionalInterfaceExample1 = (String a) -> {
		System.out.println(a.toUpperCase());
	};
	
	FunctionalInterfaceExample1 functionalInterfaceExample2 = (a) -> {
		System.out.println(a.toUpperCase());
	};
	
	FunctionalInterfaceExample1 functionalInterfaceExample3 = (a) -> System.out.println(a.toLowerCase());
	
	public static void main(String[] args) {
		Example1 example1 = new Example1();
		example1.functionalInterfaceExample1.sayMessage("Hello Java 8");
		
		example1.functionalInterfaceExample3.sayMessage("HELLO Java 8");
	}

}
