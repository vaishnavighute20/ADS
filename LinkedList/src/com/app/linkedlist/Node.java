package com.app.linkedlist;

public class Node {
	
	private int data;
	private Node next;
	
	//param const
	public Node(int data) {
		this.data = data;
		next=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
