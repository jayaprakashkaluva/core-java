package com.jp.multi.threading;

import java.util.concurrent.Semaphore;

import com.jp.semaphore.Task;

public class SemaphoreTest {
public static void main(String[] args) {
	Semaphore semaphore = new Semaphore(2);
	new Thread(new Task(semaphore), "Thread1").start();
	new Thread(new Task(semaphore), "Thread2").start();
	new Thread(new Task(semaphore), "Thread3").start();
	new Thread(new Task(semaphore), "Thread5").start();
	new Thread(new Task(semaphore), "Thread4").start();
}
}
