package completableFuture.completeExceptionally;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		System.out.println("-- running CompletableFuture --");
		CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
			System.out.println("divide by 0");
			return 4 / 0;
		}).thenApply(input -> {
			System.out.println("multiplying by 2");
			return input * 2;
		}).thenAccept(System.out::println);

		Thread.sleep(1000);
		
		System.out.println("-- checking exceptions --");
		
		boolean b = completableFuture.isCompletedExceptionally();
		
		System.out.println("completedExceptionally: " + b);
		
		System.out.println("-- calling join --");
		
		completableFuture.join();
	}

}
