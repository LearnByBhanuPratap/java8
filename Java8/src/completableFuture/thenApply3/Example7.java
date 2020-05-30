package completableFuture.thenApply3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example7 {

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
			System.out.println(sum);
			return sum;
		});
		
		CompletableFuture<Integer> completableFuture3 = completableFuture2.thenApply((a) -> {
			int sum = 0;
			for (int i = 0; i < a; i++) {
				sum = sum + i;
			}
			return sum;
		});

		Integer result = completableFuture3.get();

		System.out.println(result);

		System.out.println(completableFuture3.isDone());

	}

	public static int sum(int a, int b) {
		return a + b;
	}

}
