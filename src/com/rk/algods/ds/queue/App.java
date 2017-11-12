package com.rk.algods.ds.queue;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Queue queue = new Queue(3);

		queue.add(1);
		queue.add(2);
		queue.add(3);
		
		queue.view();
		
		queue.remove();
		
		queue.view();

	}

}
