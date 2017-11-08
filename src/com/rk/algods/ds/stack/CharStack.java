package com.rk.algods.ds.stack;

public class CharStack {
	
	private int maxSize;
	private char[] charArray;
	private int top;
	
	public CharStack(int length) {
		maxSize = length;
		charArray = new char[maxSize];
		top = -1;
	}

	public void push(char ch) {
		if(isFull()){
			try {
				throw new Exception("Stack is full");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			top++;
			charArray[top] = ch;
		}
	}
	
	public char pop() {
		if(isEmpty()){
			try {
				throw new Exception("Stack is Empty");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return 0;
		} else {
			int old_top = top;
			top--;
			return charArray[old_top];
		}
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (top == maxSize-1);
	}

}
