package completableFuture.runAsync1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
/**
 * https://www.youtube.com/c/learnbybhanu
 * https://www.udemy.com/javabybhanu
 * https://www.facebook.com/learnbybhanupratap/
 * 
 * @author Bhanu Pratap Singh
 *
 */
public class Example4 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		// CompletableFuture, by default, uses an Executor created by ForkJoinPool.commonPool()
		// to achieve the parallelism .
		CompletableFuture<Void> cf = CompletableFuture.runAsync(() -> performTask_1("first task"));

		// For a non-async stage, the task is executed in the thread that completes the previous stage.
		cf = cf.thenRun(() -> performTask_2("second task"));

		// In this example the two async tasks ran in the same thread 
		// (created by the default executor) i.e. ForkJoinPool.commonPool-worker.
		cf = cf.thenRunAsync(() -> performTask_3("third task"));
		
		cf = cf.thenRunAsync(() -> performTask_3("third task"));

		cf.join();

		System.out.println("main exiting");
	}

	private static void performTask_1(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void performTask_2(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void performTask_3(String task) {

		System.out.printf("task: %s, thread: %s%n", task, Thread.currentThread().getName());
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
