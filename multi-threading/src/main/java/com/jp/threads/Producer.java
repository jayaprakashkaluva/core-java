package com.jp.threads;

import java.util.Queue;

public class Producer implements Runnable{

	private static final int MAXSIZE = 4;
	private Queue<String> queue;

	public Producer(Queue<String> queue) {
		super();
		this.queue = queue;
	}

	public void run() {
		try {
		synchronized (queue) {
			System.out.println("-------producer got lock-----------");
		
				while (queue.size() == MAXSIZE) {
					queue.wait();
				}
				produce(queue);
			
		}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private void produce(Queue<String> queue) throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			queue.add(String.valueOf(i));
			System.out.println("-----------added into queue---------");
			queue.notifyAll();
		}
	}

}
