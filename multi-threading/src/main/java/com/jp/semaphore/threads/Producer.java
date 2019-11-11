package com.jp.semaphore.threads;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
	private Queue<String> queue;
	public void run() {
		for(int i=1;i<=7;i++) {
			try {
				queue.add(String.valueOf(i));
				System.out.println("-------added-----"+i);
			} catch (Exception e) {
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
