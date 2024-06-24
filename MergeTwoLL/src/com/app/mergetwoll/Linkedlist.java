package com.app.mergetwoll;

public class Linkedlist {
	
	 private Node head;
	 

	public Linkedlist() {
		head=null;
	}
	

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	
	// insert node 
	
	public boolean insert(int data) {
		
		Node newNode=new Node(data);
		
		if (head==null) {
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
		if(head==null) {
			return;
		}
		Node current=head;
		while(current!=null) {
			System.out.print(current.getData() + " ");
			current =current.getNext();
 		}
		
	}
	
	// 1. Java Program To Merge A Linked List Into Another Linked List At Alternate Positions
	public boolean concat(Linkedlist l1 ,Linkedlist l2) {
		Node end=l1.head;
		while(end.getNext()!=null) {
			end=end.getNext();
		}
		end.setNext(l2.head);
		return true;
		
	}
	
	// merge alternately
	public static void merge(Linkedlist l1, Linkedlist l2) 
	{
		Node temp1 = l1.head;
		Node temp2 = l2.head;
		Linkedlist l3 = new Linkedlist();
		while (temp1 != null && temp2 != null) {
			l3.insert(temp1.getData());
			l3.insert(temp2.getData());
			temp1 = temp1.getNext();
			temp2 = temp2.getNext();
		}
		while (temp1 != null) {
			l3.insert(temp1.getData());
			temp1 = temp1.getNext();
		}
		while (temp2 != null) {
			l3.insert(temp2.getData());
			temp2 = temp2.getNext();
		}
		l3.display();
	}

}
