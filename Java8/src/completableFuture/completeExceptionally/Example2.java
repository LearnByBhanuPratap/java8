package completableFuture.completeExceptionally;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
			return 9 / 0;
		}).exceptionally(exception -> {
			System.err.println("exception: " + exception);
			return 9;
		});
		
		Thread.sleep(1000);
		System.out.println(" checking exceptions ");
		boolean b = completableFuture.isCompletedExceptionally();
		
		System.out.println("completedExceptionally: " + b);
		
		System.out.println(" getting results ");
		
		int result = completableFuture.get();
		
		System.out.println(result);
	}

}
