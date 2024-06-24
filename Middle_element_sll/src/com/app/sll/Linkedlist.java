package com.app.sll;

//Q2.How do you find the middle element of a singly linked list in one pass?

public class Linkedlist {
   private Node head;
 

public Linkedlist() {
	super();
}

public Node getHead() {
	return head;
}

public void setHead(Node head) {
	this.head = head;
}
   
public boolean insert(int data) {
	Node newNode=new Node(data);
	
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
public void getmidelement() {
	 Node temp=head;
	 int i=0;
	 if(temp==null) {
		 System.out.println("list is emepty");
		 
	 }
	 int size=0;
	 while(temp!=null) {
		 size++;
		 temp=temp.getNext();
		 
	 }
	 int [] arr=new int[size];
	 temp=head;
	 int index=0;
	 while(temp!=null) {
		 arr[index]=temp.getData();
		 temp=temp.getNext();
		 index++;
		 }
      System.out.println(arr[size/2]);
}
}