package completableFuture.completeExceptionally;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example4 {

	private static void performTasks(int i) {
		
		CompletableFuture.supplyAsync(() -> 16 / i)
		.thenApply(input -> input + 1)
		.thenApply(input -> input + 3)
		
				.exceptionally(exception -> {
					System.out.println("in exceptionally");
					System.err.println(exception);
					return 3;
				}).thenApply(input -> input * 4).thenAccept(System.out::println);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		performTasks(4);
		System.out.println("------");
		performTasks(0);
	}

}
