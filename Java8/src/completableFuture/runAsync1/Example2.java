package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					throw new IllegalStateException(e);
				}
				System.out.println("separate thread than the main thread.");
			}
		});

		future.get();

	}
}
