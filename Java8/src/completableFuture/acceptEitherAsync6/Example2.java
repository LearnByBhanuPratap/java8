package completableFuture.acceptEitherAsync6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			try {
				return sum(2, 4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return null;
		});

		CompletableFuture<Integer> completableFuture2 = CompletableFuture.supplyAsync(() -> {
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			return sum;
		});

		CompletableFuture<Void> completableFuture = completableFuture1.acceptEitherAsync(completableFuture2, x -> {
			System.out.println("completableFuture Thread="+Thread.currentThread().getName());
			System.out.println(x);
			
		}).thenAccept(x -> {
			System.out.println("thenAccept Thread="+Thread.currentThread().getName());
		});
		
		
		completableFuture.join();
		
		System.out.println("result="+completableFuture);


	}

	public static int sum(int a, int b) throws InterruptedException {
		return a + b;
	}


}
