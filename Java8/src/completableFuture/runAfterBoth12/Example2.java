package completableFuture.runAfterBoth12;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example2 {

	static List<Integer> list = new ArrayList<Integer>();

	static CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> {
		for (int i = 0; i < 5; i++) {
			list.add(i);	
		}
	});

	static CompletableFuture<Void> completableFuture1 = CompletableFuture.runAsync(() -> {
		for (int i = 6; i < 11; i++) {
			list.add(i);	
		}
	});


	public static void main(String[] args) {
		completableFuture.runAfterBoth(completableFuture1, () -> {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		});
	}

}
