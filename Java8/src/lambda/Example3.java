package lambda;

public class Example3 {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("I am running");
			}
		};

		Thread thread = new Thread(runnable);

		thread.start();
		System.out.println("--------------");
		
		Runnable runnable1 = () -> {
			System.out.println("I am running");
		};
		
		Thread thread1 = new Thread(runnable1);

		thread1.start();
		
		System.out.println("--------------");
		
		Runnable runnable2 = () -> System.out.println("I am running");
		Thread thread2 = new Thread(runnable2);
		thread2.start();
		
		new Thread(() -> System.out.println("I am running")).start();

	}

}
