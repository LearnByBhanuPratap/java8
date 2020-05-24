package booleanSupplier;

import java.util.function.BooleanSupplier;

public class Example1 {

	/**
	 * Important Note: Please watch video in sequence otherwise you will not understand
	 * because each video required previous concept
	 */
	public static void main(String[] args) {

		BooleanSupplier booleanSupplier = () -> Boolean.valueOf("true");

		BooleanSupplier booleanSupplier1 = () -> 5 > 50;
		
		BooleanSupplier booleanSupplier2 = () -> {
			return "test".equalsIgnoreCase("TEST");
		};
		
		System.out.println(booleanSupplier.getAsBoolean());
		
		System.out.println(booleanSupplier1.getAsBoolean());
		
		System.out.println(booleanSupplier2.getAsBoolean());
	}

}
