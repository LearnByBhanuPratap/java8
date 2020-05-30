package completableFuture.acceptEitherAsync6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Example3 {

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
			
			double sum = 0;
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
				sum = sum + i;
				System.out.println("completableFuture "+i+"="+sum);
			}
			
		});
		
		CompletableFuture.runAsync(() -> {
			System.out.println("completableFuture3 Thread="+Thread.currentThread().getName());
			int sum = 0;
			for (int i = 0; i < 30; i++) {
				sum = sum + i;
			}
			System.out.println("completableFuture3="+sum);

		});
		
		completableFuture.join();
		
		System.out.println("result="+completableFuture);


	}

	public static int sum(int a, int b) throws InterruptedException {
		//Thread.sleep(2000);
		return a + b;
	}


}
