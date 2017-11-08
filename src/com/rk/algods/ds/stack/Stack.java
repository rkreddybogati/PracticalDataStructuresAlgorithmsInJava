package com.rk.algods.ds.stack;

public class Stack {

	private int maxSize;
	private int top;
	private long[] stackArray;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new long[maxSize];
		top = -1;
	}
	
	public void push(long value){
		top++;
		stackArray[top] = value;
	}
	
	public long pop() {
		int old_top = top;
		top--;
		return stackArray[old_top];		
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}

}
