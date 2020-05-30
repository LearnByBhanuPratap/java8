package completableFuture.timeouts8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

public class Example2 {

	static BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a*b;

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		CompletableFuture<Void> totalAmount = CompletableFuture.supplyAsync(() -> getPrice("arrow"))
				.thenCombine(CompletableFuture.supplyAsync(() 
						-> getQuantity("Wrangler")), biFunction)
				.thenAccept(amount -> System.out.println("The price is: " + amount));
		
	
		
	}

	static Integer getPrice(String brand) {

		switch (brand) {
		case "arrow":
			return 1000;
		case "Wrangler":
			return 1100;
		default:
			break;
		}
		return null;

	}

	static Integer getQuantity(String brand) {

		switch (brand) {
		case "arrow":
			return 10;
		case "Wrangler":
			return 11;
		default:
			break;
		}
		return null;

	}
}
