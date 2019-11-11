package com.jp.multi.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import com.jp.semaphore.threads.Counter;
import com.jp.semaphore.threads.CounterRunnable;

public class CounterTest {

	public static void main(String[] args) {
		Counter c = new Counter();
		Executor executor = Executors.newFixedThreadPool(10);
		executor.execute(new CounterRunnable(c));
	}
}
