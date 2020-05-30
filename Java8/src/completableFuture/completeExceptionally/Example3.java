package completableFuture.completeExceptionally;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {

	private static void performTasks(int i) {
		CompletableFuture.supplyAsync(() -> {
			return 13 / i;
		}).exceptionally(exception -> {
			System.out.println("in exceptionally");
			System.err.println(exception);
			return 3;
		}).thenApply(input -> input * 4).thenAccept(System.out::println);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		performTasks(3);
		System.out.println("------");
		performTasks(0);
	}

}
