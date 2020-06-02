package completableFuture.supplyAsync2;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

public class Example4 {

	// Important Note: Please watch video in sequence otherwise you will not understand
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		System.out.println(Thread.currentThread().getName());
		
		Supplier<String> supplier = new Supplier<String>() {
			
			@Override
			public String get() {
				// TODO Auto-generated method stub
				return null;
			}
		};

		Supplier<String> supplier1 = () -> {
			System.out.println(Thread.currentThread().getName());
			return "Running asynchronous";
		};
		
		
		CompletableFuture<String> future = CompletableFuture.supplyAsync(supplier1);
		
		String result = future.get();
		
		System.out.println(result);
	}
}
