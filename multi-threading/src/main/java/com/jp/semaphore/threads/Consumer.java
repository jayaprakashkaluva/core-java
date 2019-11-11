package com.jp.semaphore.threads;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	private BlockingQueue<String> queue ;
	public void run() {
		System.out.println("---------------consumer-----------");
		try {
			while(true) {
				System.out.println("-----------consuming ------------"+queue.take());
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Consumer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}
}
