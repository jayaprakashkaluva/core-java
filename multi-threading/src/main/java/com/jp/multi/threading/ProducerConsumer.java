package com.jp.multi.threading;

import java.util.LinkedList;
import java.util.Queue;

import com.jp.threads.Consumer;
import com.jp.threads.Producer;

/**
 * Hello world!
 *
 */
public class ProducerConsumer {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		new Thread(new Consumer(queue)).start();
		new Thread(new Producer(queue)).start();

	}
}
