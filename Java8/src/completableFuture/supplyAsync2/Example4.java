package completableFuture.supplyAsync2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Example4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
			@Override
			public String get() {
				return "Running asynchronous";
			}
		});
		String result = future.get();
		System.out.println(result);
	}
}
