package com.jp.semaphore;

import java.util.concurrent.Semaphore;

public class Task implements Runnable {

	private Semaphore semaphore;
	public void run() {
		try {
			semaphore.acquire();
			System.out.println(Thread.currentThread().getName()+"-------acquired lock-----------");
			Thread.sleep(4000);
			semaphore.release();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public Task(Semaphore semaphore) {
		super();
		this.semaphore = semaphore;
	}

}
