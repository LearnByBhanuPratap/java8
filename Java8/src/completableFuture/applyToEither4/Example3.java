package completableFuture.applyToEither4;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class Example3 {
	public static void main(String[] args) {
		
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int i = ThreadLocalRandom.current().nextInt(1, 7);
			System.out.println("from 'this' completable: " + i);
			return i;
		});
		
		CompletableFuture<Double> completableFuture2 = completableFuture.applyToEither(getOtherCompletable(), a -> {
			System.out.println("Selected value: " + a);
			return Math.sqrt(a);
		});
		
		completableFuture.join();
		Double d = completableFuture2.join();
		System.out.println(d);
	}

	private static CompletableFuture<Integer> getOtherCompletable() {
		return CompletableFuture.supplyAsync(() -> {
			int i = ThreadLocalRandom.current().nextInt(1, 9);
			System.out.println("from 'other' completable: " + i);
			return i;
		});
	}
}
