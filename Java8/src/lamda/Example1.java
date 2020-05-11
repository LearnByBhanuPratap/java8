package lamda;

public class Example1 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("running test");
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		Runnable runnable1 = () -> {
			System.out.println("runnable1 test");
		};

		thread = new Thread(runnable1);
		thread.start();

		Runnable runnable2 = () -> System.out.println("runnable2 test");

		thread = new Thread(runnable2);
		thread.start();

		new Thread(() -> System.out.println("runnable3 test")).start();

	}

}
