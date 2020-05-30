package completableFuture.supplyAsync2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println("I am main thread");

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> sum());

		Integer result = future.get();

		System.out.println(result);
		
		System.out.println(future.isDone());
		
	}

	public static int sum() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			sum = sum + i;
			System.out.println("running Asynchronous="+i);
		}
		return sum;
	}
}
