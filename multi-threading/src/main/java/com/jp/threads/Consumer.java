package com.jp.threads;

import java.util.Queue;

public class Consumer implements Runnable {
	private Queue<String> queue;
	public Consumer(Queue<String> queue) {
		super();
		this.queue = queue;
	}
	public void run() {
		while(true) {
			try {
				consume(queue);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	private void consume(Queue<String> queue) throws InterruptedException {
		synchronized (queue) {
			System.out.println("-------consumer got lock-----------");
			while(queue.isEmpty()) {
			queue.wait();
			}
			System.out.println(queue.poll());
			queue.notifyAll();
		}
	
	}

}
