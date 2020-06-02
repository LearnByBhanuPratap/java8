package completableFuture.supplyAsync2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class Example9 {

	public static void main(String[] args) {

		CompletableFuture.supplyAsync(() -> ThreadLocalRandom.current().nextInt(1, 10))
		.thenApply(Math::sqrt)
				.thenAccept(System.out::println).join();
		
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> ThreadLocalRandom.current().nextInt(1, 10));
		CompletableFuture<Double> completableFuture1 = completableFuture.thenApply(Math::sqrt);
		
		CompletableFuture<Void> completableFuture2 = completableFuture1.thenAccept(System.out::println);
		
		completableFuture2.join();
		
	}
}
