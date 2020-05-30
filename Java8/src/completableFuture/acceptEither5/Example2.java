package completableFuture.acceptEither5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("I am main thread");

		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			try {
				return sum(2, 4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		});

		CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> {
			int sum = 0;
			for (int i = 0; i < 3; i++) {
				sum = sum + i;
			}
			return sum;
		});

		completableFuture1.get();
		
		CompletableFuture<Void> result = completableFuture1.acceptEither(completableFuture2, x -> System.out.println(x));

		System.out.println(result);

		System.out.println(completableFuture2.isDone());

	}

	public static int sum(int a, int b) throws InterruptedException {
		Thread.sleep(2000);
		return a + b;
	}

}
