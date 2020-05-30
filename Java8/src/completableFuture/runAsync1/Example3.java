package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			System.out.println("separate thread than the main thread.");
		});

	}
}
