package com.jp.blockingqueue.threads;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	private BlockingQueue<String> queue ;
	public void run() {
		for(int i=1;i<=7;i++) {
			try {
				queue.put(String.valueOf(i));
				System.out.println("-------added-----"+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public Producer(BlockingQueue<String> queue) {
		super();
		this.queue = queue;
	}

}
