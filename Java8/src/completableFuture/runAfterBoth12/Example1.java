package completableFuture.runAfterBoth12;

import java.util.concurrent.CompletableFuture;

public class Example1 {
	
	static CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> System.out.println("test".toUpperCase()));

	static CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> System.out.println("test".toLowerCase()));


	public static void main(String[] args) {
		completableFuture.runAfterBoth(completableFuture1, () -> {
			System.out.println(9);
		});
	}

}
