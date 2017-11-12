package com.rk.algods.ds.linkedlist;

public class SingleyLinkedList {

	Node first;
	
	public SingleyLinkedList() {
		
	}
	
	public boolean isEmpty(){
		return (first==null);
	}
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(first);
		first = newNode;
	}
	
	public Node deleteFirst(){
		if(first==null){
			System.out.println("No data in linked list");
			return null;
		}
		Node tempNode = first;
		first = tempNode.getNext();
		tempNode.setNext(null);
		return tempNode;
	}
	
	public void addNodAtLast(int data){
		Node currentNode = null;
		if(first == null){
			first = new Node();
			first.setData(data);
			return;
		} else {
			currentNode = first;
		}		
		while (currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		Node newNode = new Node();
		newNode.setData(data);
		currentNode.setNext(newNode);
	}

	public void removeLastNode() {
		Node currentNode = first;
		Node previouseNode = null;
		while( currentNode.getNext() != null) {
			previouseNode = currentNode;
			currentNode = currentNode.getNext();
		}
		currentNode = previouseNode;
		currentNode.setNext(null);
	}
	
	public void viewLinkedList(){
		Node currentNode = first;
		while(currentNode != null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}


}
