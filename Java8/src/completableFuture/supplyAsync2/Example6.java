package completableFuture.supplyAsync2;

import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.CompletableFuture;

public class Example6 {

	public static void main(String[] args) {
		
		CompletableFuture.supplyAsync(() -> {
			try {
				URL url = new URL("https://www.google.com/");
				try (InputStream is = url.openStream()) {
					return new String(String.valueOf(is.read()));
				}
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
			// don't call join and check output
		}).thenAccept(System.out::println).thenRun(() -> System.out.println("All Done")).join();
	}

}
