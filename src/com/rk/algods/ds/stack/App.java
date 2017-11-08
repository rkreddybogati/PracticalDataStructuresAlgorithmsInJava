package com.rk.algods.ds.stack;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//playWithStack();
		System.out.println(reverseStr("abcdefgh"));
	}
	
	public static void playWithStack() {
		Stack stack = new Stack(10);
		
		boolean isFull = false;
		long i = 0;
		while(!isFull){
			if(!stack.isFull()){
				stack.push(i);
			} else {
				isFull = true;
			}
			i++;
		}
		
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
	}
	
	public static String reverseStr(String str){
		if(str == null){
			return null;
		}
		char[] charArray = str.toCharArray();
		CharStack charStack = new CharStack(charArray.length);
		for (int i = 0; i < charArray.length; i++) {
			charStack.push(charArray[i]);
		}
		
		char[] reveredChar = new char[charArray.length];
		int i = 0;
		while(!charStack.isEmpty()){
			reveredChar[i] = charStack.pop();
			i++;
		}
		
		return new String(reveredChar);
	}

}
