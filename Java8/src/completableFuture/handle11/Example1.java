package completableFuture.handle11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		String name = null;

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
			if (name == null) {
				throw new RuntimeException("Computation error");
			}
			return "Hello, " + name;
		}).handle((s, t) -> s != null ? s : t.getMessage());
		
		System.out.println(completableFuture.get());
	}

}
