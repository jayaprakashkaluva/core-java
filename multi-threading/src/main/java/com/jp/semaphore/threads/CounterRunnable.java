package com.jp.semaphore.threads;

public class CounterRunnable implements Runnable {

	private Counter counter;

	public Counter getCounter() {
		return counter;
	}

	public CounterRunnable(Counter counter) {
		super();
		this.counter = counter;
	}

	public void setCounter(Counter counter) {
		this.counter = counter;
	}

	public void run() {
		System.out.println(counter.getCount());
	}
}
