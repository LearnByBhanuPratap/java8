package completableFuture.handle11;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example2 {

	private static void performTasks(int i) {

		System.out.println(Thread.currentThread().getName());
		
		CompletableFuture.supplyAsync(() -> {
			return 14 / i;
		}).handle((input, exception) -> {
			System.out.println(Thread.currentThread().getName());
			if (exception != null) {
				System.out.println("exception block");
				System.err.println(exception);
				return 2;
			} else {
				System.out.println("increasing input by 3");
				return input + 3;
			}
		}).thenApply(input -> input * 4).thenAccept(System.out::println);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		performTasks(2);
		System.out.println("----");
		performTasks(0);
	}

}
