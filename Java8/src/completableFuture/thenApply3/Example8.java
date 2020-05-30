package completableFuture.thenApply3;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example8 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Bhanu";
		}).thenApply(name -> {
			return "Hello " + name;
		}).thenApply(request -> {
			return request + " make more Java video";
		});

		System.out.println(completableFuture.get());

	}
}
