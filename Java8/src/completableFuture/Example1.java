package completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import streamMethods.Student;

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Student> primaryFuture = CompletableFuture.completedFuture(getDate());

		CompletableFuture<Student> secondaryFuture = CompletableFuture.completedFuture(getDate_1());

		CompletableFuture<String> future = primaryFuture.applyToEither(secondaryFuture,
				student -> student.getName() + " - " + student.getAge());

		System.out.println(future.get());
		
		String original = "message";
		String result = "Test";
		
		CompletableFuture<String> output1 = CompletableFuture.completedFuture(original);
		CompletableFuture<String> output2 = CompletableFuture.completedFuture(result);
		
		CompletableFuture<Object> finalResult = output1.applyToEither(output2, x -> x.concat("I am test"));
		
		System.out.println(finalResult.get());
		
		
		CompletableFuture<String> output3  = CompletableFuture.completedFuture(original).thenApply(String::toUpperCase)
		.applyToEither(CompletableFuture.completedFuture(original).thenApply(String::toLowerCase),
				(a) -> a.concat("AAAA"));
		
		System.out.println(output3.get());
	}

	static Student getDate() throws InterruptedException {
		Thread.sleep(3000);
		Student student = new Student("AA", 20);
		return student;
	}

	static Student getDate_1() throws InterruptedException {
		Thread.sleep(30);
		Student student = new Student("CC", 40);
		return student;
	}
	
	
}
