package com.jp.semaphore.threads;

public class Counter {
private int count;

public int getCount() {
	return count++ ;
}

public void setCount(int count) {
	this.count = count;
}
}
