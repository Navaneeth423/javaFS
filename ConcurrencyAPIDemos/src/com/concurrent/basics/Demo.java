package com.concurrent.basics;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Demo {
	public static void main(String[] args) {
		CompletableFuture<String> task = CompletableFuture.supplyAsync(()->{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return "Happy Weekday";
		});
		
		//Non Blocking I/O
		task.thenAccept(str->System.out.println(str.toUpperCase()));
		System.out.println("-----In Main-----");
		
		try {
			System.out.println(task.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----Main Completed-----");
	}
}
