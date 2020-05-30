package completableFuture.acceptEitherAsync6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			System.out.println("completableFuture1 Thread=" + Thread.currentThread().getName());
			try {
				return sum(2, 4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		});

		
		CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> {
			System.out.println("completableFuture2 Thread=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			return sum;
		});
		

		CompletableFuture<Void> completableFuture3 = completableFuture1.acceptEitherAsync(completableFuture2, x -> {
			System.out.println("completableFuture Thread=" + Thread.currentThread().getName());

			double sum = 0;
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				sum = sum + i;
				System.out.println("completableFuture " + i + "=" + sum);
			}

		}, executor);
		

		CompletableFuture<Void> completableFuture4 = CompletableFuture.runAsync(() -> {
			System.out.println("completableFuture3 Thread=" + Thread.currentThread().getName());
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			System.out.println("completableFuture3=" + sum);

		}, executor);

		
		CompletableFuture<Void> completableFuture5 = CompletableFuture.runAsync(() -> {
			System.out.println("completableFuture4 Thread=" + Thread.currentThread().getName());
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			System.out.println("completableFuture4=" + sum);

		}, executor);
		

		CompletableFuture<Integer> completableFuture6 = CompletableFuture.supplyAsync(() -> {
			System.out.println("completableFuture6 Thread=" + Thread.currentThread().getName());
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			return sum;
		});

		
		CompletableFuture[] cfs = new CompletableFuture[] { completableFuture1, completableFuture2, completableFuture3,
				completableFuture4, completableFuture5, completableFuture6 };

		CompletableFuture<Void> allCf = CompletableFuture.allOf(cfs);
		allCf.join();

	}

	public static int sum(int a, int b) throws InterruptedException {
		Thread.sleep(2000);
		return a + b;
	}

}
