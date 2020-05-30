package completableFuture.acceptEitherAsync6;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;

public class Example1 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Integer> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			return 4;
		});
		
		completableFuture1.acceptEitherAsync(CompletableFuture.supplyAsync(() -> 5 ), x -> System.out.println(x));
		
		System.out.println("CommonPoolParallelism="+ForkJoinPool.getCommonPoolParallelism());
		System.out.println("getParallelism="+ForkJoinPool.commonPool().getParallelism());
	}

	public static int sum(int a, int b) throws InterruptedException {
		return a + b;
	}

}
