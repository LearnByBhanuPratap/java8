package completableFuture.cancel7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
			sleep(1000);
			System.out.println("completableFuture Thread=" + Thread.currentThread().getName());
			return sum();
		});
		
		completableFuture.cancel(true);
		
		System.out.println(completableFuture.get());
	}
	
	
	public static int sum() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			sum = sum + i;
		}
		return sum;
	}

	static void sleep(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
