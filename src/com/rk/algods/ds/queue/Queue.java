package com.rk.algods.ds.queue;

public class Queue {

	private int maxSize;
	private long[] queueArray;
	private int front;
	private int rear;
	private int currentLength;
	
	public Queue(int size) {
		this.maxSize = size;
		this.queueArray = new long[maxSize];
		this.front = 0;
		this.rear = -1;
		this.currentLength = 0;
	}
	
	public boolean isEmpty(){
		return (currentLength == 0);
	}
	
	public boolean isFull(){
		return (currentLength == maxSize);
	}
	
	public void add(long value) {
		rear++;
		queueArray[rear] = value;
		currentLength++;
	}

	public long remove(){
		int old_front = front;
		front++;
		currentLength--;
		return queueArray[old_front];
	}
	
	public void view(){
		for (int i = 0; i < currentLength; i++) {
			System.out.println("index "+ i +  ":" + queueArray[i]);
		}
	}
	
}
