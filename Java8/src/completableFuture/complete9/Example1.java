package completableFuture.complete9;

import java.util.concurrent.CompletableFuture;

public class Example1 {

	static CompletableFuture<Integer> testMethod() {

		CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				sum = sum + i;
			}
			return sum;
		}).whenComplete((result, ex) -> {
			if (result != 45) {
				System.out.println(result);
			} else {
				throw new RuntimeException("I am test");

			}
		});

		return future;
	}

	static void testMethod_1() {
		try {
			testMethod().get();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {

		testMethod_1();

		System.out.println(Thread.currentThread());

	}

}
