package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example5 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		// Rather than relying on default Executor we can also supply our own executor by using 
		// overloaded method runAsync(Runnable runnable, Executor executor):
		ExecutorService executor = Executors.newFixedThreadPool(3);

		CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> performTask_1("first task"),executor);

		cf = cf.thenRun(() -> performTask_2("second task"));

		cf = cf.thenRunAsync(() -> performTask_3("third task"),executor);
		
		cf = cf.thenRunAsync(() -> performTask_3("fourth task"),executor);

		((CompletableFuture<Void>) cf).join();

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
