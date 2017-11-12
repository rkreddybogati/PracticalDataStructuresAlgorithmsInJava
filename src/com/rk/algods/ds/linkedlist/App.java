package com.rk.algods.ds.linkedlist;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node nodeA = new Node();
		nodeA.setData(4);
		
		Node nodeB = new Node();
		nodeA.setData(3);
		
		Node nodeC = new Node();
		nodeA.setData(7);
		
		Node nodeD = new Node();
		nodeA.setData(8);
		
		nodeA.setNext(nodeB);
		nodeB.setNext(nodeC);
		nodeC.setNext(nodeD);
		nodeD.setNext(null);

		//System.out.println(listLength(nodeA));
		//System.out.println(listLength(nodeB));
		
		testLinkedList();
	}
	
	private static int listLength(Node n) {
		int length = 0;
		if(n == null){
			return length;
		}
		Node currentNode = n;
		while(currentNode.getNext() != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length+1;
	}
	
	private static void testLinkedList(){
		SingleyLinkedList linkedList = new SingleyLinkedList();
		/*linkedList.insertFirst(4);
		linkedList.insertFirst(3);
		linkedList.insertFirst(2);*/
		linkedList.addNodAtLast(5);
		linkedList.addNodAtLast(6);
		linkedList.addNodAtLast(7);
		linkedList.addNodAtLast(8);
		linkedList.addNodAtLast(9);
		linkedList.addNodAtLast(10);
		linkedList.removeLastNode();
		linkedList.removeLastNode();
		
		linkedList.viewLinkedList();
	}
	
}
