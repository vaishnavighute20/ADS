package com.app.reverse;

public class Linkedlist {
	
	private Node head;
 
	public Node getHead() {
		return head;
	}

	public Linkedlist() {
		head = null;

	}

	public boolean insert(int data) {

		Node newNode = new Node(data);


		if (head == null) {
			head = newNode;
		
			return true;

		}

		Node temp = head;
 		
		while (temp.getNext() != null) {
			temp = temp.getNext();
 
		
	}
		temp.setNext(newNode);
 		return true;
}
	
	// display
		public void display() {
			if (head == null) {
				return;
			}
			Node current = head;
			while (current != null) {
				System.out.print(current.getData() + " ");
				current = current.getNext();
			}
			System.out.println();
	
}
		
		public void reverse() {
			if (head == null || head.getNext() == null) {
				return;
			}

			Node n1 = head;
			Node n2 = head.getNext();

			while (n2 != null) {
				Node n3 = n2.getNext();
				n2.setNext(n1);
				n1 = n2;
				n2 = n3;
			}

			head.setNext(null);
			head = n1;
		}
}
