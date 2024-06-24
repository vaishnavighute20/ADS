package com.app.removeduplicate;

 
public class Linkedlist {
	private Node head;
	
	public Node getHead() {
		return head;
	}
	   
	public boolean insert(int data) {
		Node newNode=new Node(data);
		if(newNode == null) {
			return false;
		}
		if(head==null) {
			head=newNode;
		     return true;	
		}
		Node temp=head;
		while(temp.getNext()!=null) {
			temp=temp.getNext();
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
}
