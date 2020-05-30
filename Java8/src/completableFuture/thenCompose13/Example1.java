package completableFuture.thenCompose13;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example1 {

	private static ExecutorService service = Executors.newCachedThreadPool();

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Function<Integer, Supplier<List<Integer>>> getFirstTenMultiples = num -> () -> Stream.iterate(num, i -> i + num)
				.limit(10).collect(Collectors.toList());

		Supplier<List<Integer>> multiplesSupplier = getFirstTenMultiples.apply(13);

		CompletableFuture<List<Integer>> getMultiples = CompletableFuture.supplyAsync(multiplesSupplier, service);

		Function<List<Integer>, CompletableFuture<Integer>> sumNumbers = multiples -> CompletableFuture
				.supplyAsync(() -> multiples.stream().mapToInt(Integer::intValue).sum());

		CompletableFuture<Integer> summedMultiples = getMultiples.thenComposeAsync(sumNumbers, service);
		
		System.out.println(summedMultiples.get());

	}

}
