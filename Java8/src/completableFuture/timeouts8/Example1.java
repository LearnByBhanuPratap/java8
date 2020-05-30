package completableFuture.timeouts8;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

public class Example1 {

	static BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a*b;

	
	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
		
		// by default a CompletableFuture uses the common thread pool but this can be parametrised with an Executor 
		// using an overload of supplyAsync
		Integer totalAmount = CompletableFuture.supplyAsync(() -> getPrice("arrow"))
				.thenCombine(CompletableFuture.supplyAsync(() -> getQuantity("Wrangler")), biFunction).get();
		
		System.out.println(totalAmount);
		
		
		totalAmount = CompletableFuture.supplyAsync(() -> getPrice("arrow"))
				.thenCombine(CompletableFuture.supplyAsync(() -> 
				getQuantity("Wrangler")), biFunction).get(1, TimeUnit.SECONDS);
		
		System.out.println(totalAmount);
		
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
