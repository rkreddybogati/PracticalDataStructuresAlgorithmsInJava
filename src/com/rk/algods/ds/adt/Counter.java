package com.rk.algods.ds.adt;

public class Counter {
	
	private int counter = 0;
	private String counterName = null;
	
	public Counter(String counterName) {
		this.counterName = counterName;
	}
	
	public void increment() {
		counter++;		
	}
	
	public int getCurrentValue() {
		return counter;		
	}
	
	public String toString() {
		return "This is " + counterName + " Counter. And its current values is "
				+ counter;	
	}

}
