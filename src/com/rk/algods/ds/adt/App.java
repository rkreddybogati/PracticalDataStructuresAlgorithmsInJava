package com.rk.algods.ds.adt;

public class App {

	/** Abstract data type example.
	 * @param args
	 */
	public static void main(String[] args) {
		
		Counter counter = new Counter("InteCounter");
		
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		
		System.out.println(counter);

	}

}
