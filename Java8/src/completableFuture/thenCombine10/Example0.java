package completableFuture.thenCombine10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example0 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
				.thenCombine(CompletableFuture.supplyAsync(() -> " Java"), (s1, s2) -> s1 + s2);

		System.out.println(completableFuture.get());
	}
}
