package completableFuture.thenCombine10;

import static java.util.concurrent.CompletableFuture.supplyAsync;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Example2 {

	static public String[] getFruits() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new String[] { "apple", "papaya", "banana" };
	}

	static public String[] getVeggies() {
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new String[] { "broccoli", "sprout" };
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newFixedThreadPool(2);

		Supplier<String[]> supplier1 = () -> {
			System.out.println(Thread.currentThread().getName());
			return getFruits();
		};

		Supplier<String[]> supplier2 = () -> {
			System.out.println(Thread.currentThread().getName());
			return getVeggies();
		};

		CompletableFuture<String[]> future = supplyAsync(supplier1);

		future.thenCombineAsync(supplyAsync(supplier2), (fruits, veggies) -> {
			return Stream.concat(Arrays.stream(fruits), Arrays.stream(veggies));
		}, executor).thenAccept(items -> items.forEach(System.out::println));

		// The CompletableFuture. join() method is similar to the get method, but it
		// throws an unchecked exception
		// in case the Future does not complete normally. This makes it possible to use
		// it as a method reference in the Stream
		future.join();
	}
}
