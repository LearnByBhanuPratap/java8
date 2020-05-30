package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example6 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Void>  completableFuture = CompletableFuture.runAsync(() -> performTask_1("first task"));

		completableFuture = completableFuture.thenRun(() -> performTask_2("second task"));

		completableFuture = completableFuture.thenRunAsync(() -> performTask_3("third task"));
		
		completableFuture = completableFuture.thenRunAsync(() -> performTask_3("third task"));

		((CompletableFuture<Void>) completableFuture).join();

		System.out.println("main exiting");
	}

	private static void performTask_1(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void performTask_2(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void performTask_3(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
