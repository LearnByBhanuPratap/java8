package completableFuture.supplyAsync2;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class Example6 {
	
	static Supplier<String> supplier = () -> {
		try {
			URL url = new URL("https://www.google.com/");
			try (InputStream is = url.openStream()) {
				return new String(String.valueOf(is.read()));
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}	
	};
	
	Runnable runnable = new Runnable() {
		public void run() {
			
		}
	};
	
	Runnable runnable1 = () -> System.out.println("I am runnable1");

	public static void main(String[] args) {
		
		CompletableFuture<String> cf = CompletableFuture.supplyAsync(supplier);
		
		CompletableFuture<Void> cf1 = cf.thenAccept(System.out::println);
		// The join() method is similar to get() . The only difference is that it throws an unchecked exception
		// if the underlying CompletableFuture completes exceptionally.
		cf1.thenRun(() -> System.out.println("All Done")).join();
	}

}
