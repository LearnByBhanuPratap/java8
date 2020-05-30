package completableFuture.thenApply3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example6 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("I am main thread");

		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			return sum(2, 4);
		});

		CompletableFuture<Integer> completableFuture2 = completableFuture1.thenApply((a) -> {
			int sum = 0;
			for (int i = 0; i < a; i++) {
				sum = sum + i;
			}
			return sum;
		});

		Integer result = completableFuture2.get();

		System.out.println(result);

		System.out.println(completableFuture2.isDone());

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
