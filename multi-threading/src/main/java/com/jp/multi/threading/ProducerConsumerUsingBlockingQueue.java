package com.jp.multi.threading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import com.jp.blockingqueue.threads.Consumer;
import com.jp.blockingqueue.threads.Producer;

public class ProducerConsumerUsingBlockingQueue {

	public static void main(String[] args) {
		BlockingQueue<String> queue = new LinkedBlockingQueue<String>(3);
		new Thread(new Producer(queue)).start();
		new Thread(new Consumer(queue)).start();
		
	}

}
