package com.concurrent.basics;

import java.util.concurrent.*;

class MyRun implements Runnable {

	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

public class ConcurrencyAPI {
	
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i=0;i<50;i++) {
			service.execute(()->{
				System.out.println(Thread.currentThread().getName());
			});
		}
	}
}
